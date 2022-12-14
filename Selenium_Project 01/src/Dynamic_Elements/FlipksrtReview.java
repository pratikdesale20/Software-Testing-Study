package Dynamic_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipksrtReview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		     
		 driver.get("https://www.flipkart.com/");
		 
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.name("q")).sendKeys(" I phone 14 pro max");
	
	Thread.sleep(1500);
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 Thread.sleep(3000);
		 
		 String reviews = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
Thread.sleep(1000);		 
		 
		 System.out.println(reviews);
		 
		 
		 
		 
		

	}

}
