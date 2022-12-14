package Upstox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_User {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
		     
	 driver.get("https://login-v2.upstox.com/");	 
Thread.sleep(1000);

    driver.findElement(By.name("userId")).sendKeys("BB3263");
    
    driver.findElement(By.name("password")).sendKeys("Rajendra@123");
    
    driver.findElement(By.id("submit-btn")).click();
 Thread.sleep(1000);
 
    driver.findElement(By.name("yob")).sendKeys("1991");
 Thread.sleep(5000);
  
    driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
 Thread.sleep(1000);
 
    String ActualUN = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();  
    
    String ExpectedUN = "Rajendra J.";
    
    
// Validating Actaul AND Expected UserName
    
    if(ActualUN.equals(ExpectedUN))
    {
    	System.out.println("Username Matching TestCase Is Pass");
    }
    else
    {
    	System.out.println("Username not matcing Testcase is Fail");
    }
		
System.out.println("===========================================================================");		
		
	// 2) Check Funds

   driver.findElement(By.id("funds")).click();
Thread.sleep(1000);

   String myFunds = driver.findElement(By.xpath("(//div[text()='-91.23'])[1]")).getText();
   
	System.out.println(myFunds);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
