package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_MethodUse {

	public static void main(String[] args) throws InterruptedException {
	

    System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
         
        WebDriver driver=new ChromeDriver();
        
	driver.manage().window().maximize();
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1500);
		
	WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
	
		System.out.println(checkbox.isSelected());
		
		checkbox.click();
		
	System.out.println(checkbox.isSelected());
	
System.out.println("=================================================================");		
		
driver.get("https://en-gb.facebook.com/");

driver.manage().window().maximize();
           //use of link text and partial link text	

           //	driver.findElement(By.linkText("Forgotten password?")).click();

          //	driver.findElement(By.partialLinkText("Forgotten password?")).click();

   driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

     Thread.sleep(3000);

     WebElement femalebutton = driver.findElement(By.xpath("//input[@value='1']"));

    femalebutton.click();
  
    System.out.println(femalebutton.isSelected());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
