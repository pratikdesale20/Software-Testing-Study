package waitsInSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaits {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
				
		 driver.get("https://www.discoveryplus.in/");	 
		 
Wait <WebDriver> wait= new FluentWait<WebDriver>(driver)

     .withTimeout(Duration.ofSeconds(30))

     .pollingEvery(Duration.ofSeconds(5))
     
     .ignoring(NoSuchElementException.class);

		 
	WebElement locator =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")))	;
	
	  locator.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
