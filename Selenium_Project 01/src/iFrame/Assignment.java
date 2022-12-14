package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
         
        WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

		driver.get("https://vctcpune.com/selenium/practice.html");
Thread.sleep(3000);

		driver.switchTo().frame("courses-iframe");
		
        driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
    
   driver.switchTo().defaultContent();     
        
   Thread.sleep(3000);

       WebElement Radiobutton = driver.findElement(By.xpath("(//input[@name='radio'])[2]"));
         
         Radiobutton.click();
         
System.out.println("============================================================================");  

   WebElement dropbox = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Thread.sleep(5000);		
		Select object=new Select(dropbox);

		object.selectByVisibleText("Option1");
		
	Thread.sleep(2000);
	   
	  // driver.switchTo().parentFrame();
	   
	
		
		
		
		
		
		
		
		
		
	}

}
