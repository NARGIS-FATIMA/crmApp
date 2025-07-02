package com.comcast.crm.leadstest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.objectrepositoryUtility.CreateNewLeadPage;
import com.comcast.crm.objectrepositoryUtility.CreatingNewProductPage;
import com.comcast.crm.objectrepositoryUtility.HomaPage;
import com.comcast.crm.objectrepositoryUtility.LeadInfoPage;
import com.comcast.crm.objectrepositoryUtility.LeadPage;
import com.comcast.crm.objectrepositoryUtility.LoginPage;
import com.comcast.crm.objectrepositoryUtility.ProductInfoPage;
import com.comcast.crm.objectrepositoryUtility.ProductPage;
import com.comcast.crm_generic_fileutility.ExcelUtility;
import com.comcast.crm_generic_fileutility.FileUtility;
import com.comcast.crm_generic_webdriverutility.JavaUtility;
import com.comcast.crm_generic_webdriverutility.WebDriverUtility;

public class CreateLeadTest {

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
		
		String leadName = eLib.getStringDataFromExcel("leads", 1, 2)+jLib.getRandomNumber();
		String cmpny = eLib.getStringDataFromExcel("leads", 1, 3)+jLib.getRandomNumber();
		
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
		hp.getLeadLink().click();
		LeadPage lpage = new LeadPage(driver);
		lpage.getCreateLeadIcon().click();
		CreateNewLeadPage cnp = new CreateNewLeadPage(driver);
		cnp.createLead(leadName,cmpny);
		LeadInfoPage lip = new LeadInfoPage(driver);
		String actLeadName = lip.getHeadertxt().getText();
		if(actLeadName.contains(leadName)) {
			System.out.println(actLeadName+"is verified===Pass");
		}else {
			System.out.println(actLeadName+"is not verified===FAIL");
		}
		
		hp.logout();
		driver.quit();

	}

}
