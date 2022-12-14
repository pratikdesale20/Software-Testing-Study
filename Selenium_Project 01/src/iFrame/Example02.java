package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example02 {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
         
        WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	   driver.switchTo().frame("courses-iframe"); //switching selenium focus from  main page to iframe
Thread.sleep(2000);

	   String mytext = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class ')]")).getText();
	   
	   System.out.println(mytext);
	   
 //  switching selenium focus from iframe to main page
	   
	   driver.switchTo().defaultContent();
	   
	 String mytext1 = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
	 
		System.out.println(mytext1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
