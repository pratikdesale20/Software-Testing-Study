package Desired_Capabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilities_Study {

	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
      
  //create object of chrome options
	
	    ChromeOptions opt=new ChromeOptions();
	    
	    
  //call method addArguments and add desired options    
	
	    opt.addArguments("--disable-notifications");
	
	
	    WebDriver driver=new ChromeDriver(opt);
	    driver.manage().window().maximize();
			     
	    driver.get("https://www.justdial.com/");
			
Thread.sleep(10000);

     String mytext = driver.findElement(By.xpath("//span[text()='Popular Services']")).getText();
     
     System.out.println("text is "+mytext);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
