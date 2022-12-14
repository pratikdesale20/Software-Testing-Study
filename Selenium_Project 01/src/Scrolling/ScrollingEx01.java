package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEx01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
				
		 driver.get("https://www.facebook.com/login/");	 

		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));	
	
		js.executeScript("window,scrollBy(0,800)");
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
