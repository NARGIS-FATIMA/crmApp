package com.comcast.crm.producttest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.objectrepositoryUtility.ContactInfoPage;
import com.comcast.crm.objectrepositoryUtility.ContactPage;
import com.comcast.crm.objectrepositoryUtility.CreateNewContactPage;
import com.comcast.crm.objectrepositoryUtility.CreatingNewProductPage;
import com.comcast.crm.objectrepositoryUtility.HomaPage;
import com.comcast.crm.objectrepositoryUtility.LoginPage;
import com.comcast.crm.objectrepositoryUtility.ProductInfoPage;
import com.comcast.crm.objectrepositoryUtility.ProductPage;
import com.comcast.crm_generic_fileutility.ExcelUtility;
import com.comcast.crm_generic_fileutility.FileUtility;
import com.comcast.crm_generic_webdriverutility.JavaUtility;
import com.comcast.crm_generic_webdriverutility.WebDriverUtility;

public class CreateProductTest {

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
		
		String proName = eLib.getStringDataFromExcel("product", 1, 2)+jLib.getRandomNumber();
		
		
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
		hp.getProdLink().click();
		ProductPage pp = new ProductPage(driver);
		pp.getCreateProductIcon().click();
		CreatingNewProductPage cpp = new CreatingNewProductPage(driver);
		cpp.createProduct(proName);
		ProductInfoPage pip = new ProductInfoPage(driver);
		String actProName = pip.getHeaderTxt().getText();
		if(actProName.contains(proName)) {
			System.out.println(proName+"is verified===Pass");
		}else {
			System.out.println(proName+"is not verified===FAIL");
		}
		
		hp.logout();
		driver.quit();

	}

}
