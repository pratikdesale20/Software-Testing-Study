package TestNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void FB() {
	  
	   System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
      
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");

}
  @Test
     public void amazon()
     {
    	System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
         
 	    WebDriver driver=new ChromeDriver();
 	    driver.manage().window().maximize();

 		driver.get("https://www.policybaaar.com/");

    	 
    	 
    	 
     }
  
  
  
  
}
