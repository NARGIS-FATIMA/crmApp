package class_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CliniqueSignInHighlight {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.clinique.in/");
		
		Actions actions = new Actions(driver);
		//ac
//		Thread.sleep(20000);
//		driver.findElement(By.id("dismissBtn")).click();

	}

}
