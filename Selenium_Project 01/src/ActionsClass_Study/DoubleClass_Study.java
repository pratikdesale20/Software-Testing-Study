package ActionsClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClass_Study {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		
     //Mouse action--> Double Click
		
	// (1) Create object of Actions class and pass driver object as a Argument	
		
		   Actions act=new Actions(driver);
		
   // (2). By using one of the actions class methods, perform desired action
		
		
		WebElement DoublElement = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
// there are three way to excuted
		
//	(01)	act.moveToElement(DoublElement).perform();
//		
//		    act.doubleClick().perform();
//		
		
// (02)		act.doubleClick(DoublElement).doubleClick().build().perform();
		
            act.doubleClick(DoublElement).perform();
		

 // //Mouse action--> Context Click-->(Right Click)
		
      	WebElement Rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
//	(01)	act.moveToElement(Rightclickbutton).perform();
//		
//		   act.contextClick().perform();
		
// (02)		act.moveToElement(Rightclickbutton).contextClick().build().perform();
		
		
		act.contextClick(Rightclickbutton).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
