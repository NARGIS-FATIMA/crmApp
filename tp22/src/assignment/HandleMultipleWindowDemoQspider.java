package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindowDemoQspider {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/");
		//click on UITesting
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		//popup
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		//browser windoe
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		
		//window Id Parent
		
		String pId = driver.getWindowHandle();
		System.out.println(pId);
		
		//click on watch
		driver.findElement(By.xpath("(//button[text()='view more'])[1]")).click();
		
		//all window Id
		Set<String> allId = driver.getWindowHandles();
		allId.remove(pId);
		
		for(String id:allId) {
			driver.switchTo().window(id);
			
			//Add to cart
			
			driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();

		}
		
		
	}

}
