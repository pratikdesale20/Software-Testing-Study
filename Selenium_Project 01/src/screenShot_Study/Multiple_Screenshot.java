package screenShot_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Multiple_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
         
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
	Thread.sleep(2000);
	
		    File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    
	   System.out.println(SRC);
	   
	   String Str=RandomString.make(3);
	   
	   File Des= new File("E:\\\\ScreenShots.QA\\\\ScreenShot"+Str+".png");
	   
	   FileHandler.copy(SRC, Des);
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
