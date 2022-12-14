package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mySelenium_1StCode {

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
	
      WebDriver driver= new ChromeDriver();
	
      driver.manage().window().maximize() ;   
      
		 driver.get("https://amazon.in/");

		 Thread.sleep(2000);
		 
		 driver.get("https://www.youtube.com/");
		 
		 Thread.sleep(2000);
		//   driver.close();
		//   driver.quit();
		 
	//	driver.get("https://www.online.citibank.co.in/");
 driver.navigate().to("https://www.online.citibank.co.in/");
 
        Thread.sleep(2000);
        
 driver.navigate().back();
 
		Thread.sleep(1000);
		
 driver.navigate().forward();
 
 driver.navigate().refresh();
 
 
		
		

	}

}
