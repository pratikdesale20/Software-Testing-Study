package Scrolling;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
	        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
				
		 driver.get("https://vctcpune.com/selenium/practice.html");	

	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
// getting default position
	
	    Point defaultPosition = driver.manage().window().getPosition();
		 
		System.out.println(defaultPosition); 
		 
// to set position, we need to create object of point class and pass X & Y value
		
		Point P=new Point(0,8);
		
		driver.manage().window().setPosition(P);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
