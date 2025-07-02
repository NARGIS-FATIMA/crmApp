package practice.contact;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
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

public class CreateContactWithSupportDataTest {

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
		Sheet sheet = wb.getSheet("contact");
		Row row = sheet.getRow(4);
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
		
		//step4
		
		Date dateObj = new Date();	
		SimpleDateFormat sim =new SimpleDateFormat("yyyy-MM-dd");
	    String startDate	=sim.format(dateObj);
	    Calendar calender = sim.getCalendar();
	    calender.add(Calendar.DAY_OF_MONTH,30);
	    String endDate=  sim.format(calender.getTime());
	    
		//last name
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		//support date
		driver.findElement(By.name("support_start_date")).clear();
		driver.findElement(By.name("support_start_date")).sendKeys(startDate);
		//support end date
		driver.findElement(By.name("support_end_date")).clear();
		driver.findElement(By.name("support_end_date")).sendKeys(endDate);
		//save
		driver.findElement(By.name("button")).click();
		
		//verify startdate contact info Expected Result
		String actStartDate = driver.findElement(By.id("dtlview_Support Start Date")).getText();
		if(actStartDate.equals(startDate)) {
			System.out.println(startDate+"is available");
		}else {
			System.out.println(startDate+"is not available");
		}
		//verify enddate contact info Expected Result
				String actEndDate = driver.findElement(By.id("dtlview_Support End Date")).getText();
				if(actEndDate.equals(endDate)) {
					System.out.println(endDate+"is available");
				}else {
					System.out.println(endDate+"is not available");
				}

	}

}
