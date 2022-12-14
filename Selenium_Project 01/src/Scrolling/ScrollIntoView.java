package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
				
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));				
		
		WebElement hidebutton = driver.findElement(By.id("displayed-text"));
		
	// Scrolling to view
		
		JavascriptExecutor  Js=(JavascriptExecutor)driver;
		
		Js.executeScript("arguments[0].scrollIntoView(true)",hidebutton);
		
		
		System.out.println(hidebutton.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
