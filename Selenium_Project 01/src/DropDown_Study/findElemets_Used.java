package DropDown_Study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElemets_Used {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		     
		 driver.get("https://www.google.com/");
Thread.sleep(2000);	

// how many links are there in google UI?
		
	  List<WebElement> Links = driver.findElements(By.tagName("a"))	;
		
		System.out.println(Links.size());
		
	// what are this Links?
		
		for (WebElement Li:Links)
		{
			System.out.println(Li.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
