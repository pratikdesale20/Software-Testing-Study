package ActionsClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Past_Assignment {

	public static void main(String[] args) throws InterruptedException {
			
   System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
	        
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");

		
    WebElement CreateAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
    
    Actions Act=new Actions(driver);
	
	  Act.click(CreateAcc).perform();
	  
// send the capital name	  
Thread.sleep(2000);		

	
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		
         WebElement destination = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		
		
		Act.moveToElement(firstname).sendKeys("PRATIK DESALE").click().perform();
		
		Act.keyDown(firstname, Keys.CONTROL).sendKeys("c").build().perform();
		
	//	Act.sendKeys("c").perform();
		
Thread.sleep(1000);

		Act.moveToElement(destination).click().perform();
		
		Act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
