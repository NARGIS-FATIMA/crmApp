package basic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		//window Id of Parent
		String pId = driver.getWindowHandle();
		System.out.println(pId);
		//click on Facebook
		driver.findElement(By.linkText("Facebook")).click();
		//All Id
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		
		for(String cId : allId) {
			driver.switchTo().window(cId);
			if(driver.getTitle().contains("Facebook")) {
				driver.findElement(By.xpath("//span[text()='Email address or phone number']")).sendKeys("nargis123");
			}
			
		}

	}

}
