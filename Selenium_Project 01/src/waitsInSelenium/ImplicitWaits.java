package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
				
		 driver.get("https://www.discoveryplus.in/?gclid=CjwKCAiA9qKbBhAzEiwAS4yeDXvXINimQbV-QtTZAktXJJPmXV2HhqxGjLiOCtLPqjbJZnF3A-PpFRoCO-sQAvD_BwE");
		
		
		// Thread.sleep.(2000)=======>> its a Static Waits
		
		// By Using Dynamic waits=====>> Implicit Wait
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
}
