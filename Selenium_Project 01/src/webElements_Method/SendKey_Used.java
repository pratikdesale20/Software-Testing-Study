package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey_Used {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
		driver.manage().window().maximize();
		
	driver.get("https://www.facebook.com/login/");
	     Thread.sleep(1000);
	     
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9689030357");
	
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("fri5326ship");
	
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
	
  System.out.println("========================================================================");		
		 
  Thread.sleep(1000);
	
    driver.get("https://www.amazon.in/");

   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Vivo Mobile Phone");

  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
System.out.println("================================================================================");

























	}

}
