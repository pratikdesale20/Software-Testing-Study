package Dynamic_Elements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	     
	 driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("honda");
	
	Thread.sleep(2000);
				
	 List<WebElement> names = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		
		System.out.println("No of options--->"+names.size());
		
		
		 for (WebElement result:names) 
		 {
			 System.out.println(result.getText());
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
