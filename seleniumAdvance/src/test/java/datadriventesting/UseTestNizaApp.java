package datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

public class UseTestNizaApp {

	public static void main(String[] args) throws SQLException {
		final Map<String, Object> chromePrefs = new HashMap<>();
		chromePrefs.put("credentials_enable_service", false);
		chromePrefs.put("profile.password_manager_enabled", false);
		chromePrefs.put("profile.password_manager_leak_detection", false); // <======== This is the important one

		final ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://49.249.28.218:8091/");
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		//password
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		//signIn
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.findElement(By.linkText("Projects")).click();
		//create project
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		//project name
		driver.findElement(By.name("projectName")).sendKeys("Build123456778");
		//project Manager
		driver.findElement(By.name("createdBy")).sendKeys("abc");
		//DropDown
		WebElement projectStatus = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
		projectStatus.click();
		Select select = new Select(projectStatus);
		select.selectByIndex(1);
		//submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//verify the project in db
		boolean flag=false;
		String expectedProjName = "abc";
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
		System.out.println("=====Done======");
		Statement stat = conn.createStatement();
		ResultSet resultset = stat.executeQuery("select * from project where created_By =\"abc\";");
		while(resultset.next()) {
			String actProjName = resultset.getString(2);
			if(expectedProjName.equals(actProjName)) {
				flag=true;
				System.out.println(expectedProjName+"is available");
			}
			
		}
		if(flag==false) {
			System.out.println(expectedProjName+"is not available");
		}
		conn.close();
	}

}
