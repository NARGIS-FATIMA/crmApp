package revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoperStack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		Thread.sleep(3000);
		driver.get("https://www.shoppersstack.com/");
		//click on women link
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("women")));
		Thread.sleep(1000);
		driver.findElement(By.id("women")).click();
		//add to cart
		Thread.sleep(5000);
		//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5000));
		//wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='fashion2wear ']/../..//button[@type='button']")));
		driver.findElement(By.xpath("//span[text()='fashion2wear ']/../..//button[@type='button']")).click();
		

	}

}
