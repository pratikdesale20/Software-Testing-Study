package Dynamic_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Assignment {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		     
		 driver.get("https://www.flipkart.com/");
		 		
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();	
		
Thread.sleep(1000);

      driver.findElement(By.xpath("//div[text()='Electronics']")).click();
      
  Thread.sleep(1000);
  
  // mouse action perform on
  
  Actions act=new Actions(driver);
  Thread.sleep(2000);
  
  WebElement refElement = driver.findElement(By.xpath("//span[text()='Electronics']"));
  
		  
  act.moveToElement(refElement).perform();
  
  Thread.sleep(3000);
  
  WebElement Click = driver.findElement(By.xpath("//a[@title='Samsung']"));
  
  act.moveToElement(Click).click().build().perform();
  
 // Then we want to show the specific samsung mobile review......
 Thread.sleep(2000);
  
  driver.findElement(By.xpath("//a[@title='SAMSUNG Galaxy F23 5G (Aqua Blue, 128 GB)']")).click();
  
 Thread.sleep(15000);
 
    String Review = driver.findElement(By.xpath("((//div[@class='gUuXy- _16VRIQ'])//span)[6]")).getText();
 Thread.sleep(3000); 
 
 
   System.out.println(Review);
  
  
  
  
  
  
  

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
