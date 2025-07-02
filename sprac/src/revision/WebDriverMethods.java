package revision;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//1
		driver.get("https://shoppersstack.com/");
		//2
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		//3
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		//4
		//driver.close();
		//5
		//driver.quit();
		//6
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		//Dimension Size = driver.manage().window().getSize();
		//System.out.println(Size);
		//driver.manage().window().setSize(new Dimension(200,200));
		//Thread.sleep(3000);
		//Point posi = driver.manage().window().getPosition();
		//Thread.sleep(3000);
		//driver.manage().window().setPosition(new Point(30,39));
		
		//7
		//driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.navigate().to(new URL("https://demowebshop.tricentis.com/login"));
		
		//8
		String html = driver.getPageSource();
		//System.out.println(html);
		//9.getWindowHandle
		//10.getWindowHandles
		//11.switchTo
		

	}

}
