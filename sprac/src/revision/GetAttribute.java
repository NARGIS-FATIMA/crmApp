package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Try actiTIME for Free")).click();
		

	}

}
