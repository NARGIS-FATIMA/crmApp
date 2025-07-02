package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.RowId;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrganizationUsingExcel {

	public static void main(String[] args) throws IOException {
		//read common data from property file
		FileInputStream fis = new FileInputStream("C:\\Users\\miraj\\OneDrive\\Desktop\\Data\\data1.properties");

	
				
				Properties pro = new Properties();
				pro.load(fis);
				String BROWSER = pro.getProperty("browser");
				String URL = pro.getProperty("url");
				String USERNAME = pro.getProperty("username");
				String PASSWORD = pro.getProperty("password");
				
				//generate the random Number
				Random random = new Random();
				int randomInt = random.nextInt(1000);
				
				
			 //read Test Script data from excel file
				
				FileInputStream fis1 = new FileInputStream("C:\\Users\\miraj\\OneDrive\\Desktop\\Data\\ExcelDataDrivenTestingE.xlsx");
				//step 2: open WorkBook in read Mode
				Workbook wb = WorkbookFactory.create(fis1);
				//step 3: get the control of the org sheet
				Sheet sh = wb.getSheet("Sheet1");
				//step4: get the control of the 1st Row
				Row row = sh.getRow(1);
				//step5: get the control of the 2nd cell & read the String data
				String orgData = row .getCell(2).toString() + randomInt;
				System.out.println(orgData);
				//step 6:cloase the Workbook
				wb.close();
				
				
				
				WebDriver driver = null;
				
				if(BROWSER.equals("chrome")) {
					driver = new ChromeDriver();
				}else if(BROWSER.equals("firefox")) {
					driver = new FirefoxDriver();
				}
				else if(BROWSER.equals("edge")) {
					driver = new EdgeDriver();
				}else {
					driver=new ChromeDriver();
				}
				
				//Step1: Login to app
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get(URL);
				driver.findElement(By.name("user_name")).sendKeys(USERNAME);
				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
				driver.findElement(By.id("submitButton")).click();
				
				
				//step2: navigate to organization module
				
				driver.findElement(By.linkText("Organizations")).click();
				
				//Step3: Click on create organization Button
				
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				
				//step 4 :enter all the details & create new organization
				
				driver.findElement(By.name("accountname")).sendKeys(orgData);
				
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				//step5 logout
				WebElement logout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				Actions actions = new Actions(driver);
				actions.moveToElement(logout).perform();
				driver.findElement(By.linkText("Sign Out")).click();
				
				driver.quit();
				
				
				
				
				
				
				
				
				
		

	}

}
