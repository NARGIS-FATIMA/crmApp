package com.comcast.crm.opportunities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.objectrepositoryUtility.HomaPage;
import com.comcast.crm.objectrepositoryUtility.LoginPage;
import com.comcast.crm.objectrepositoryUtility.OpportunitiesPage;
import com.comcast.crm_generic_fileutility.ExcelUtility;
import com.comcast.crm_generic_fileutility.FileUtility;
import com.comcast.crm_generic_webdriverutility.JavaUtility;
import com.comcast.crm_generic_webdriverutility.WebDriverUtility;

public class CreatingNewOpportunityTest {

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
		
		String CampignName = eLib.getStringDataFromExcel("campaigns", 1, 2)+jLib.getRandomNumber();
		String AssignTo = eLib.getStringDataFromExcel("campaigns", 1, 4);
		String date = jLib.getRequiredDateYYYYDDMM(30);
		
		
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
		hp.getOpportunity().click();
		OpportunitiesPage op = new OpportunitiesPage(driver);
		op.getPlusIcon().click();
		
	}

}
