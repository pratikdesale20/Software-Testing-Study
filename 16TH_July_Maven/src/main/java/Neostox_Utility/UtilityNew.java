package Neostox_Utility;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew
{

	public static String readDataFrompropertyFile(String Key) throws IOException
	{
		//create object of Properties class--> java
		
		Properties prop=new Properties();
	
	    // create object of FileInputStream and pass properties file path as a parameter	
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\16TH_July_Maven\\NeoStox_Properties");
		
		prop.load(myfile);
		
		String value = prop.getProperty(Key);
		Reporter.log("Reading " +Key+ " from property file", true);
		return value;
		
   }
	
	  public static void Screenshot (WebDriver driver,String ScreenshotName) throws IOException
	  {
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  File dest=new File("F:\\Software Testing Notes\\ScreenshotAS\\"+ScreenshotName+".png");
		  
		  FileHandler.copy(src,dest);
		  
		  Reporter.log("taking screenshot", true);
		  
	  }
	
	 public static void ScrollIntoView(WebDriver driver,WebElement element)
	 {
		JavascriptExecutor  js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element );
		Reporter.log("SCrolling into view",true);
	}
	
	
	public static void wait(WebDriver driver,int WaitTime)
	{
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis( WaitTime));
	  Reporter.log("Waiting for "+WaitTime+"ms",true);
	}
	
	
  
	
	
	
	
	
}
