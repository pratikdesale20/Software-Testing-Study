package webDriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_GetURL {

	public static void main(String[] args) throws InterruptedException {
	
    System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
             
          WebDriver driver=new ChromeDriver();
          
       driver.get("https://www.youtube.com/"); 		  
		
		Thread.sleep(1500);
		
	 System.out.println(driver.getTitle());
		
		   String myTitle = driver.getTitle();
		   
	System.out.println("Title of webpage is "+myTitle);
	
	System.out.println(driver.getCurrentUrl());
		
	    String  myURL=driver.getCurrentUrl();
		
	 System.out.println("URL of Webpage is "+myURL);	
		
		
		
	}

}
