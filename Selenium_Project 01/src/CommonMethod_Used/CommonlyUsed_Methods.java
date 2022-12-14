package CommonMethod_Used;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
//import java.time.temporal.TemporalAmount;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsed_Methods {


 // Screenshot Method 	
	
	public static void takeScreenShot(WebDriver driver,String name) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\ScreenShots.QA\\ScreenShot"+name+".png");
		
		FileHandler.copy(src, dest);
		
	}
	
		
		
 // Scrollinto View
	
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		
		JS.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	
		
		
// implicit Wait 
	

	public static void ImplicitWaits(WebDriver driver, int i) 
	{
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(i));
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


