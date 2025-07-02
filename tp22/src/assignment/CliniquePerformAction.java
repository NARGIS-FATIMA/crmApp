package assignment;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.checkerframework.framework.qual.FromByteCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CliniquePerformAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.clinique.in/");


		String pId = driver.getWindowHandle();
		//SkinCare
		WebElement skinCare = driver.findElement(By.xpath("//a[@aria-label='View Skincare menu']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(skinCare).perform();
		//String elem = driver.findElement(By.xpath("//a[contains(text(),'All Skincare')]/following-sibling::a")).getText();
		//System.out.println(elem);
		 List<WebElement> sb = driver.findElements(By.xpath("//a[contains(text(),'All Skincare')]/following-sibling::a"));
		 
		 for(WebElement element: sb) {
			 System.out.println(element.getText());
		 }
		

		
		////a[contains(text(),'All Skincare')]/following-sibling::a
		
       
	}

}
