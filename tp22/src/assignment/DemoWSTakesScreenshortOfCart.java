package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoWSTakesScreenshortOfCart {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		//Books
		driver.findElement(By.partialLinkText("Books")).click();
		//Link of specific book
		driver.findElement(By.linkText("Computing and Internet")).click();
		//addToCart
		driver.findElement(By.xpath("//h1[contains(text(),'Computing')]/../..//input[@id='add-to-cart-button-13']")).click();
		//computer
		driver.findElement(By.partialLinkText("Computers")).click();
		//click
		driver.findElement(By.xpath("//img[@alt='Picture for category Notebooks']")).click();
		
		driver.findElement(By.linkText("14.1-inch Laptop")).click();
		//addToCart
		driver.findElement(By.xpath("//h1[contains(text(),'14.1-inch Laptop')]/../..//input[@id='add-to-cart-button-31']")).click();
		
		//electronic
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		
		driver.findElement(By.linkText("50's Rockabilly Polka Dot Top JR Plus Size")).click();
		driver.findElement(By.xpath("//h1[contains(text(),'Rockabilly Polka Dot')]/../..//input[@id='add-to-cart-button-5']")).click();
		//goto Shopping cart
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		//TakesScreenShot
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShot/page.png");
		FileHandler.copy(temp, src);
		
		
	}

}
