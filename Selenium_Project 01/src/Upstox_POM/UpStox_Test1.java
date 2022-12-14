package Upstox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpStox_Test1 {

	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
		
 driver.get("https://login-v2.upstox.com/");	 
 Thread.sleep(1000);
	
	
// create object for loginPage
 
   Upstox_LoginPage login=new Upstox_LoginPage(driver);
   
   login.enterUserID();
   login.enterPassword();
   login.ClickOnSignButton();

Thread.sleep(2000);

// create object for passcode page

      Upstox_PasscodePage Passcode=new Upstox_PasscodePage(driver);
    		 
    	Passcode.enterpasscode();	  
Thread.sleep(5000);
 
// 		create object of welcome page
		
       Upstox_WelcomePage welcome=new Upstox_WelcomePage(driver);
       
       welcome.ClickOnIAmGoodButton();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
