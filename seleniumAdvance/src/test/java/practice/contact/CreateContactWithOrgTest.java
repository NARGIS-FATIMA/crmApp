package practice.contact;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateContactWithOrgTest {
	
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\miraj\\OneDrive\\Desktop\\ExcelForTestCases\\common.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String BROWSER = pobj.getProperty("browser");
		String URL= pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		
		//generate random number
		Random random = new Random();
		int randomInt=random.nextInt(10000);
		
		//Read test script data
		FileInputStream fis1 = new FileInputStream("C:\\Users\\miraj\\OneDrive\\Desktop\\ExcelForTestCases\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet("contact");
		Row row = sheet.getRow(7);
		String orgName = row.getCell(2).toString()+randomInt;
		String contactLactName = row.getCell(3).getStringCellValue();
		wb.close();
		
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
		//navigate to contact module
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(1000);
		//step3 click on create Create buttton
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		//last name
		driver.findElement(By.name("lastname")).sendKeys(contactLactName);
		
		//+llokup
		driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
		//switch to child window
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String windowID=it.next();
			driver.switchTo().window(windowID);
			
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains("module=Accounts")) {
				break;
			}
		}
		
		driver.findElement(By.name("search_text")).sendKeys(orgName);
		driver.findElement(By.name("search")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='"+orgName+"']")).click();
		Thread.sleep(2000);
		
		//switch to parent window
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String windowID=it1.next();
			driver.switchTo().window(windowID);
			
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains("Contacts&action")) {
				break;
			}
		}
		Thread.sleep(1000);
		//save
		driver.findElement(By.name("button")).click();
		Thread.sleep(1000);
		//Verify Header Phone number Expected Result
		headerInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(headerInfo.contains(contactLactName)) {
			System.out.println(contactLactName+"is created===PASS");
		}else {
			System.out.println(contactLactName+"is not created===Fail");
		}
		//verify Header OrgName info Expected Result
		String actOrgName = driver.findElement(By.id("mouseArea_Organization Name")).getText();
		if(actOrgName.trim().equals(orgName)) {
			System.out.println(orgName+"is available");
		}else {
			System.out.println(orgName+"is not available");
		}


	}

}
