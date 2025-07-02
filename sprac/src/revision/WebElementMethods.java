package revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Electronics\r\n")).click();
		//driver.findElement(By.partialLinkText("Jewelry\r\n")).click();
		//driver.findElement(By.partialLinkText("Digital downloads\r\n")).click();
		//driver.findElement(By.partialLinkText("Apparel & Shoes\r")).click();

	}

}
