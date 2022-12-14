package NeoStox_Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import Neostox_Utility.UtilityNew;

public class Base1 {
	
	

		protected WebDriver driver;
		
		public void LaunchBrowser() throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
	        
			 driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
				     
			 driver.get(UtilityNew.readDataFrompropertyFile("URL"));
			 
			 
			 
			 
			 
			 
			 
			 Reporter.log("Launching Browser",true);
			 Thread.sleep(1000);
			 
			 
			 
			 
			 
		}
		
		
		
		public static void closingBrowser(WebDriver driver) throws 
		InterruptedException
	{
		Reporter.log("closing browser", true);
		Thread.sleep(500);
		driver.close();
		
		
       }
}
