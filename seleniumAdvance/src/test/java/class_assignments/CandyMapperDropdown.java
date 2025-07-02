package class_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CandyMapperDropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://candymapper.com/");
		//close popUp
		driver.findElement(By.id("popup-widget307423-close-icon")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500);");
		
		driver.switchTo().frame(1);
		
//		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframe-undefined14']"));
//		driver.switchTo().frame(iframe);
//		
		//country
		
			WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='tCounty']"));
			//countryDropdown.click();
			Select select = new Select(countryDropdown);
			select.selectByVisibleText("Bedfordshire");
		
		

	}

}
