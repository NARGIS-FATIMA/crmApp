package com.contact.crm.orgtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import javax.security.auth.login.LoginContext;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm_generic_fileutility.ExcelUtility;
import com.comcast.crm_generic_fileutility.FileUtility;
import com.comcast.crm_generic_webdriverutility.JavaUtility;

public class CreateOrgTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		
		
		//common data
		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String URL= fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");
		
		
		
		//Read test script data
		
		String orgName = eLib.getDataFromExcel("org", 1, 2)+jLib.getRandomNumber();
		
		
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		//password
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		//login
		driver.findElement(By.id("submitButton")).click();
		//navigate to Organization
		Thread.sleep(1000);
		driver.findElement(By.linkText("Organizations")).click();
		Thread.sleep(1000);
		//step3 click on create Organization buttton
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//organization name
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		//save
		driver.findElement(By.name("button")).click();
		//Verify Header Expected Result
		String headerInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(headerInfo.contains(orgName)) {
			System.out.println(orgName+"is created===PASS");
		}else {
			System.out.println(orgName+"is not created===Fail");
		}
		//verify Header OrgName info Expected Result
		String actOrgName = driver.findElement(By.id("dtlview_Organization Name")).getText();
		if(actOrgName.equals(orgName)) {
			System.out.println(orgName+"is available");
		}else {
			System.out.println(orgName+"is not available");
		}
		
		
		

	}

}
