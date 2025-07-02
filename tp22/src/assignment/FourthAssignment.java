package assignment;

import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FourthAssignment {

	public static void main(String[] args) {
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
		driver.findElement(By.name("projectName")).sendKeys("Seleniumsdfgv");
		//project Manager
		driver.findElement(By.name("createdBy")).sendKeys("Vaishali");
		//DropDown
		WebElement projectStatus = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
		projectStatus.click();
		Select select = new Select(projectStatus);
		select.selectByIndex(1);
		//submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
