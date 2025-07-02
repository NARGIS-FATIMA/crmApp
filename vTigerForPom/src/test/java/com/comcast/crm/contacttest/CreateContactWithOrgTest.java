package com.comcast.crm.contacttest;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.objectrepositoryUtility.ContactInfoPage;
import com.comcast.crm.objectrepositoryUtility.ContactPage;
import com.comcast.crm.objectrepositoryUtility.CreateNewContactPage;
import com.comcast.crm.objectrepositoryUtility.CreateNewOrganizationPage;
import com.comcast.crm.objectrepositoryUtility.HomaPage;
import com.comcast.crm.objectrepositoryUtility.LoginPage;
import com.comcast.crm.objectrepositoryUtility.OrganizationInfoPage;
import com.comcast.crm.objectrepositoryUtility.OrganizationsPage;
import com.comcast.crm.objectrepositoryUtility.OrganizationsWindowPage;
import com.comcast.crm_generic_fileutility.ExcelUtility;
import com.comcast.crm_generic_fileutility.FileUtility;
import com.comcast.crm_generic_webdriverutility.JavaUtility;
import com.comcast.crm_generic_webdriverutility.WebDriverUtility;

public class CreateContactWithOrgTest {

	public static void main(String[] args) throws Throwable {
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wlib = new WebDriverUtility();
		
		
		//common data
		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String URL= fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");
		//Read test script data
		
		String orgName = eLib.getStringDataFromExcel("Org",1,2)+jLib.getRandomNumber();
		String lastName = eLib.getStringDataFromExcel("contact", 1, 2)+jLib.getRandomNumber();
		String search = "Organization Name";
		
		
		
		//
		WebDriver driver=null;
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if (BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if (BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
		//step1: Login to App
		wlib.ImplicitwaitForPageToLoad(driver);
		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		lp.loginToapp(USERNAME, PASSWORD);
		HomaPage hp = new HomaPage(driver);
		hp.getOrgLink().click();
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewORgBtn().click();
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
		cop.createOrg(orgName);
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actOrgName = oip.getHeaderMsg().getText();
		if(actOrgName.contains(orgName)) {
			System.out.println(orgName+"is verified===Pass");
		}else {
			System.out.println(orgName+"is not verified===FAIL");
		}
		//for contact
		Thread.sleep(1000);
		hp.getContactLink().click();
		Thread.sleep(1000);
		ContactPage cp = new ContactPage(driver);
		cp.getCreateNewContactBtn().click();
		Thread.sleep(1000);
		CreateNewContactPage cnp = new CreateNewContactPage(driver);
		cnp.getLnameField().sendKeys(lastName);
		Thread.sleep(1000);
		//Thread.sleep(2000);
		cnp.getLookupBtn().click();
		//window switch
		wlib.switchTowindowWithUrl(driver, "module=Accounts");
		
		driver.findElement(By.name("search_text")).sendKeys(orgName);
		driver.findElement(By.name("search")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='"+orgName+"']")).click();
		
//		OrganizationsWindowPage owp = new OrganizationsWindowPage(driver);
//		owp.passSearchData(orgName, search);
		//back to window
		wlib.switchTowindowWithUrl(driver, "Contacts&action");
		cnp.getSaveBtn().click();
		ContactInfoPage cip = new ContactInfoPage(driver);
		Thread.sleep(2000);
		String actText = cip.getHeaderText().getText();
		if(actText.contains(lastName)) {
			System.out.println(lastName+"is verified===Pass");
		}else {
			System.out.println(lastName+"is not verified===FAIL");
		}
		
		String actOrgNamenew = driver.findElement(By.id("mouseArea_Organization Name")).getText();
		if(actOrgNamenew.trim().equals(orgName)) {
			System.out.println(orgName+"is available");
		}else {
			System.out.println(orgName+"is not available");
		}
		
		hp.logout();
		driver.quit();
	}

}
