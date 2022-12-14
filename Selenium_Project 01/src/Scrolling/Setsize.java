package Scrolling;


import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
				
		 driver.get("https://vctcpune.com/selenium/practice.html");	
		 
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));			
		
   // how to get size 

        Dimension defaultsize = driver.manage().window().getSize();
        
        System.out.println(defaultsize);		
		
// to set the size , we need to create object of dimension class and pass width and height value
        
        Dimension d=new Dimension (1100,400);
		
// by using dimension object set the size using setSize Method
        
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

       driver.manage().window().setSize(d);

// 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
