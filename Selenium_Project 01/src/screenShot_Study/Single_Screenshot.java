package screenShot_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Single_Screenshot {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
     
     WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

	driver.get("https://www.instagram.com/");
	
      File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   
	System.out.println(source);
	
	  
	
	  File destination= new File("E:\\ScreenShots.QA\\myFile.png");
	
	
	  FileHandler.copy(source, destination);
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
