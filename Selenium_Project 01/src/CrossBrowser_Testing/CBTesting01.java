package CrossBrowser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTesting01
{   WebDriver driver;

   @Parameters("browserName")
  @Test
  public void browserTest(String bname) 
  {
	  if(bname.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "F:\\Software Testing Notes\\QA\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  
	   
	  else if(bname.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
	 }
	   
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
}
}
