package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Ex02 {

	public static void main(String[] args) throws InterruptedException {
	
   System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");

 driver.manage().window().maximize();
 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	      
		
	    Thread.sleep(2000);
	    
	    WebElement Malebutton = driver.findElement(By.xpath("//input[@value='2']"));

	    Thread.sleep(1000);
	    
	    Malebutton.click();
	    
	 System.out.println(Malebutton.isSelected()); 
	 
// using if-Else Statement using check value true or false	 
	     
	if(Malebutton.isSelected())
	{
		System.out.println("Redio button already selected ");
	}
	else
	{
		System.out.println("Redio button not Selected....pls check");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
