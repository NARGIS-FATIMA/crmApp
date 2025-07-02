package class_assignments;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Try {

	
		public static void main(String[] args) throws Throwable {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://candymapper.com/");

	        // Close popup
	        driver.findElement(By.id("popup-widget307423-close-icon")).click();

	        // Scroll to bring iframe into view
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1500);");

	        // Wait a bit for iframe to load
	        Thread.sleep(3000);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframe-undefined14']"));
	        wait.until(ExpectedConditions.visibilityOf(iframe));

	        // Switch to iframe containing the dropdown
	       
	        driver.switchTo().frame(iframe);

	        // Wait until dropdown is visible
	       
	        WebElement countryDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.name("tCounty")));

	        // Select option from dropdown
	        Select select = new Select(countryDropdown);
	        select.selectByVisibleText("Bedfordshire");

	        System.out.println("Dropdown option selected successfully.");
	        
	        //driver.quit();
	    }
	
	}


