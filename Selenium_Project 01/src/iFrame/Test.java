package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
         
         WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
Thread.sleep(3000);

		driver.switchTo().frame("iframeResult");
		
	driver.findElement(By.xpath("//button[@type='button']")).click();	
		
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
