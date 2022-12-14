package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_MethodUse {

	public static void main(String[] args) throws InterruptedException {
	
 System.setProperty("webdriver.chrome.driver","F:\\\\Software Testing Notes\\\\QA\\\\chromedriver_win32\\\\chromedriver.exe");
       
     WebDriver driver=new ChromeDriver();
     
     driver.manage().window().maximize();
     
     driver.get("https://www.discoveryplus.in/");
     
     Thread.sleep(2000);
     
    driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
    
    Thread.sleep(1000);
    
    WebElement getOTP = driver.findElement(By.xpath("//button[@type='submit']"));
    
       System.out.println(getOTP.isEnabled());
       
     getOTP.click();
 
 System.out.println("======================================================================");    
  
 driver.findElement(By.id("mobileNumber")).sendKeys("9689030357");
   
     System.out.println(getOTP.isEnabled());
     
     getOTP.click();
     
  System.out.println("===============================================================================");  
     
	 driver.get("https://en-gb.facebook.com/");
	
	 WebElement password = driver.findElement(By.id("pass"));
     
     System.out.println(password.isEnabled());
     
     password.click();
    
     
                      
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
