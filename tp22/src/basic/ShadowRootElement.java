package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowRootElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/");
		//Click on QuickStart Button
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		//Click on Shadow Root Element
		driver.findElement(By.xpath("//section[text()='Shadow Root Elements']")).click();
		//Click on Shadow Root 
		driver.findElement(By.xpath("//section[text()='Shadow Root']")).click();
		
		
		Thread.sleep(3000);
		//Shadow Host -->> Identifyig Shadow Host
		SearchContext ShadowRootElement = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		//username
		ShadowRootElement.findElement(By.cssSelector("input[type='text']")).sendKeys("nargis");
		Thread.sleep(1000);
		//Shadow Host -->> Identifyig Shadow Host
		SearchContext ShadowRoot = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		//password
		ShadowRoot.findElement(By.cssSelector("input[type='text']")).sendKeys("fatima");
		
		
	}

}
