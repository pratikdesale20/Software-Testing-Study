package ActionsClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions_Study {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
	        
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");	
		
		WebElement emailname = driver.findElement(By.id("email"));
		
	//	emailname.sendKeys("psdesale1998@gmail.com");
		
		Actions act=new Actions(driver);
		
	//	act.moveToElement(emailname).sendKeys("psdesale1998@gmail.com").build().perform();
		
		act.sendKeys(emailname, "pratikdesale").perform();
		
System.out.println("=============================================================================");

      WebElement CreateAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
	  act.click(CreateAcc).perform();
	  
Thread.sleep(1000);

      WebElement day = driver.findElement(By.id("day"));
	  
	  act.click(day).perform();
		
// how to handle drop down
		
		
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(1000);
//		
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(500);
//		
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(500);
//		
//		act.sendKeys(Keys.ARROW_UP).perform();
//		
		
		for (int i=0;i<=10;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(100);
		}
		    act.sendKeys(Keys.ENTER).perform();
		    
		    
		
		WebElement name = driver.findElement(By.name("firstname"));
		
		act.keyDown(name, Keys.SHIFT).sendKeys("pratik").build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
