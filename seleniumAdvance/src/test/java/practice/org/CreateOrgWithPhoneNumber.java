package practice.org;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateOrgWithPhoneNumber {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		Sheet sheet = wb.getSheet("Org");
		Row row = sheet.getRow(7);
		String orgName = row.getCell(2).toString()+randomInt;
		String phoneNumber = row.getCell(3).toString();
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
		//navigate to Organization
		Thread.sleep(1000);
		driver.findElement(By.linkText("Organizations")).click();
		Thread.sleep(1000);
		//step3 click on create Organization buttton
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//organization name
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		//phone num
		driver.findElement(By.id("phone")).sendKeys(phoneNumber);
		//save
		driver.findElement(By.name("button")).click();
		//Verify Header Expected Result
		String actPhoneNum = driver.findElement(By.id("dtlview_Phone")).getText();
		if(actPhoneNum.equals(phoneNumber)) {
			System.out.println(phoneNumber+"is created===PASS");
		}else {
			System.out.println(phoneNumber+"is not created===Fail");
		}
		

	}

}
