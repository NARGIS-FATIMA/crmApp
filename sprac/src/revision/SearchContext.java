package revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchContext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		//1.id
		//driver.findElement(By.id("men")).click();
		
		//2.partiallinkText
		driver.findElement(By.partialLinkText("Computers")).click();
		
		//3.xpath
		driver.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();
		
		//4.LinkText
		driver.findElement(By.linkText("Computers"));
		
		//5.name
		driver.findElement(By.name("NewsletterEmail")).sendKeys("1234");
		
		//6.classname
		//driver.findElement(By.className("button-1 login-button")).click();
		
		//7.

	}

}
