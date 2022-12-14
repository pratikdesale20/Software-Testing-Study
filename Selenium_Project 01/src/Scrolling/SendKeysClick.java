package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonMethod_Used.CommonlyUsed_Methods;

public class SendKeysClick {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
				
		 driver.get("https://www.w3schools.com/");	 
		
		CommonlyUsed_Methods.ImplicitWaits(driver, 1000);
		
// sendkeys functionality done through JavaScriptExecutor
		
		WebElement searchbox= driver.findElement(By.id("search2"));
		
	    CommonlyUsed_Methods.scrollIntoView(driver, searchbox);
	    
	    JavascriptExecutor JS=(JavascriptExecutor)driver;
	    
	    JS.executeScript("arguments[0].value='MySQL Tutorial';", searchbox);
	    CommonlyUsed_Methods.ImplicitWaits(driver, 2000);    
	    
	  
 // click Functionality done through JavaScriptExecutor	    
	    
	    WebElement clickbox =driver.findElement(By.id("learntocode_searchbtn"));
	    
	    JS.executeScript("arguments[0].click()", clickbox);
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
