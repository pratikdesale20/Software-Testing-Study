package PopUp_Study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_ChildPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("https://vctcpune.com/");
		
		String mainpageid=driver.getWindowHandle();
		System.out.println(mainpageid);
driver.findElement(By.xpath("(//a[text()='Start Selenium')"));	
		
		Set<String> allids = driver.getWindowHandles();
				
System.out.println("===========================================================================");


		System.out.println(allids);
		
		Iterator<String> it = allids.iterator();
		
		String mainpage=it.next();
		
		String childpage=it.next();
		
		driver.switchTo().window(childpage);
		
		WebElement text = driver.findElement(By.xpath(childpage));

System.out.println("==============================================================================");

       System.out.println("Selenium page text is "+text.getText());
       
       Thread.sleep(2000);
       
		driver.switchTo().window(mainpage);
		
		WebElement text1 = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']"));
		
		
System.out.println("=========================================================================================");

      System.out.println("Velocity Class Inquiry page is "+text1.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
