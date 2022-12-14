package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_Used {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
		driver.manage().window().maximize();
		
	  driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
	  
     		//first method to access
	  WebElement myElement=driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
			  System.out.println(myElement.getText());
	  
		
		    // second method to access
	//	Thread.sleep(1000);
     // System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Welcome")).getText());

			  
		
		
		
		
		

	}

}
