package webDriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args)  {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
         
         WebDriver driver=new ChromeDriver();
		
         driver.get("https://vctcpune.com/");
		      
         String expectedTitle="Velocity | Best software testing centre in Pune and Mumbai";
		
		String actualTitle= driver.getTitle();
		
		   if(expectedTitle.equals(actualTitle))
		   {
			   System.out.println("Title is matching TestCase is passed");
		   }
		   else
		   {
			   System.out.println("Title is NOT matching TestCase is Failed");
		   }
		
		driver.close();
		
		
		
		
		
	
	}

}
