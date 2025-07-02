package revision;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoQspiderMultipleWindoe {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
//		driver.findElement(By.xpath("//section[text()='Popups']")).click();
//		WebElement popup = driver.findElement(By.xpath("//section[text()='Popups']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", popup);
//		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Multiple Windows")).click();
//		String pId = driver.getWindowHandle();
//		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
//		Set<String> allId = driver.getWindowHandles();
//		allId.remove(pId);
//		for(String id:allId) {
//			driver.switchTo().window(id);
//			driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
//			
//		}
//		driver.switchTo().defaultContent();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		//driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		//driver.findElement(By.xpath("//td[text()='Levis Shirt']/..//input[@type='checkbox']")).click();
		//driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		//driver.findElement(By.linkText("Prompt")).click();
		//driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		//driver.findElement(By.xpath("//input[@id='resume']")).sendKeys("C:\\Users\\miraj\\OneDrive\\Desktop\\commondata.properties");
		
		//driver.findElement(By.xpath("//section[text()='Notifications']")).click();
		//driver.findElement(By.xpath("//button[text()='Notification']")).click();
		
		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		driver.findElement(By.xpath("(//section[text()='Scroll'])[2]")).click();
		driver.findElement(By.linkText("Vertical")).click();
		driver.findElement(By.linkText("Open In New Tab")).click();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100);");
	}

}
