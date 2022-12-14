package NeoStox_Base;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;



public class Base
{

	protected WebDriver driver;
	
	public void LaunchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://neostox.com/");
		 Reporter.log("Launching Browser",true);
		 Thread.sleep(1000);
		 
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
