package Dynamic_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Show_image {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     
	 driver.get("https://www.google.com/");
	 
Thread.sleep(2000);	
		
		 WebElement search = driver.findElement(By.name("q"));
		
		 search.sendKeys("Iphone 14");
Thread.sleep(1000);		
         
   driver.findElement(By.xpath("(//li[@class='sbct'])[1]")).click();
   
   driver.findElement(By.xpath("//a[text()='Images']")).click();
		
// I want to see how many images are present that UI
   
  //     List<WebElement> imglist = driver.findElements(By.xpath("//div[@class='mJxzWe']//div"));
	
  //          List<WebElement> imglist = driver.findElements(By.xpath("//div[@class='mJxzWe']"));
 Thread.sleep(1500);
           List<WebElement> imglist = driver.findElements(By.xpath("//div[@id='islmp']//div"));
 
	System.out.println(imglist.size());
		
	Thread.sleep(2000);
	
	// what are the img in webpage
	
	for (WebElement im:imglist)
	{
		System.out.println(im.getText());
	}
	
	  
	
	
	  
	   	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
