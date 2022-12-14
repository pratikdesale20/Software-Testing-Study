package ActionsClass_Study;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import CommonMethod_Used.CommonlyUsed_Methods;

public class Scroll_Actions {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
				
		 driver.get("https://vctcpune.com/selenium/practice.html");	 
		 
		 
	// create object for action class and scroll using scrollByAmount()
		 
		 Actions Act=new Actions(driver);
		 
		 Act.scrollByAmount(0, 300).perform();
		 
 //  Scroll by using scrollInView () commonused methods
		 
		 WebElement alert= driver.findElement(By.id("alertbtn"));
		 
		 CommonlyUsed_Methods.scrollIntoView(driver, alert);
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
