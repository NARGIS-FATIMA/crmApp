package self;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchEmptyChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//1
		
		// To Launch empty Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//2
		
		//To open BaskinRobin Website
	    driver.get("https://baskinrobbinsindia.com/");
	    
	    //3
	    
	    //To maximize webPage
	    driver.manage().window().maximize();
	    
	    //4
	    //To do fullScreen
//	    
//	    driver.manage().window().fullscreen();
//	    
	    
	    //5
	    //To minimize webPage
//	    Thread.sleep(3000);
//	    driver.manage().window().minimize();
	    
	    //6
		//To get Title of Website
	    String titleOfSite = driver.getTitle();
	    System.out.println(titleOfSite);
	    
	    //7
	    
	    //To get current Url
	    String curUrl = driver.getCurrentUrl();
	    System.out.println(curUrl);
	    
	    //8
	    //To Close the browser
	    //It will close the Parent webPage and will not stop the server
//	    Thread.sleep(3000);
//	    driver.close();
	    
	    //9
	    //To quit the browser
	    //It will close the Parent webPage as well as Child Web Page and also it will stop the browser
	    Thread.sleep(3000);
	    driver.quit();
	    
	    //10
	    
	    //To get the SourceCode(HTML) of webPage
	    
	    String srcCode = driver.getPageSource();
	    System.out.println(srcCode);

	}

}
