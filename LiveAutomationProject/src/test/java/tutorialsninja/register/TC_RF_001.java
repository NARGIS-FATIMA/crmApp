package tutorialsninja.register;


import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_001 {

	@Test
	
	public void verifyRegisterWithMandatoryFields() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Nargis");
		driver.findElement(By.id("input-lastname")).sendKeys("Fatima");
		driver.findElement(By.id("input-email")).sendKeys(generateNewEmail());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("User@123");
		driver.findElement(By.id("input-confirm")).sendKeys("User@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
	}
	public String generateNewEmail() {
		String emailWithTimeStamp = new Date().toString().replaceAll(" ", "").replaceAll("\\:", "")+"@gmail.com";
		return emailWithTimeStamp;
		
	}

}
																			