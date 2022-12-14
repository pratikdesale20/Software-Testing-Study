package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay_Method {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		WebElement Textbox = driver.findElement(By.id("displayed-text"));
		
		//Textbox.sendKeys("I am learning Automation");
		
		WebElement Hidebutton =driver.findElement(By.id("hide-textbox"));
		     Hidebutton.click();
		
		WebElement Showbutton =driver.findElement(By.id("show-textbox"));
		    Showbutton.click();
		     
		
	if(Textbox.isDisplayed())
	{
		Textbox.sendKeys("I am Learning Testing");
	}
	else
	{
		System.out.println("text box is not displyed, plz check");
	}
		
	// means Here is "if" condition is true then given statement is displayed on specific input give on webpage 	
	// or "If"	condition is false then printing massage show on console.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
