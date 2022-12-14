package ActionsClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action_ClassEg01 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
	        
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
// ({01})  Mouse action--> move to Element	
		
	// 1. Create object of Actions class and pass driver object as an argument	
		
		Actions Act=new Actions(driver);
		
   // 2. By using one of the actions class methods perform required actions		
Thread.sleep(3000);
		
		WebElement refElement = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		Act.moveToElement(refElement).perform();
		
	Thread.sleep(2000);
	
     WebElement Click = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
	     
// there are 3-Types for that specific function performance
	     
//	(01)     Act.moveToElement(Click).perform();
//	         Thread.sleep(3000);
//	          Act.click().perform();
		
		
//  (02)	Act.moveToElement(Click).click().build().perform();
		
		   Act.click(Click).perform();
		
		
// ({02})  Mouse action--> Drag and Drop		
		
Thread.sleep(3000);		   
		   
		WebElement Source = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		
		WebElement target = driver.findElement(By.id("amt7"));
		
//	(01)	Act.moveToElement(Source).clickAndHold().release(target).build().perform();
		
		Act.dragAndDrop(Source, target).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
