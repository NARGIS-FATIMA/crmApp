package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowRootForClose {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		
		Thread.sleep(3000);
		
		//Identify WE which is near to shdow root
        driver.findElement(By.xpath("//h1[text()='Login']")).click();		
        //Handle by using Actions Class
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		actions.sendKeys("nargis").perform();
		//for Password
		actions.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		actions.sendKeys("fatima").perform();

	}

}
