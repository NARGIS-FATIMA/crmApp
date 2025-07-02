package practice.contact;

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

public class CreateOrgTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
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
		Row row = sheet.getRow(1);
		String lastName = row.getCell(2).toString()+randomInt;
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
