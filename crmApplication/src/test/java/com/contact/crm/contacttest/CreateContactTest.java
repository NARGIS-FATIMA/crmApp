package com.contact.crm.contacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
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

public class CreateContactTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		//create Object
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		//read common data from json file
		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String URL= fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");
		
		//generate random number
		Random random = new Random();
		int randomInt=random.nextInt(10000);
		
		//Read test script data
		String lastName = eLib.getDataFromExcel("contact", 1, 2)+randomInt;
	
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
		//navigate to Contact
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(1000);
		//step3 click on create Create buttton
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		//last name
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		//save
		driver.findElement(By.name("button")).click();
		//Verify Header Expected Result
		String headerInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		
		//verify lastname contact info Expected Result
		String actLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		if(actLastName.equals(lastName)) {
			System.out.println(lastName+"is available");
		}else {
			System.out.println(lastName+"is not available");
		}

	}

}
