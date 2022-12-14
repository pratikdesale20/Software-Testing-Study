package webDriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
         
         WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		String expectedURL="https://www.instagram.com/";
		
		String actualURL=driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL))
		{
			System.out.println("URL is matching TestCase is passed");
		}
		else
		{
			System.out.println(" URL is Not matching TestCase is failed");
		}
		
		driver.close();
		

	}

}
