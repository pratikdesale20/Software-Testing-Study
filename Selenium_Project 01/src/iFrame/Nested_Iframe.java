package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Iframe {

	public static void main(String[] args)    {
 System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
         
        WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");

		WebElement MainPageText= driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		System.out.println("Main Page Text="+MainPageText.getText());
		
	////switching focus from main page to parent frame
		
driver.switchTo().frame("frame1");

         WebElement ParentFrameText = driver.findElement(By.xpath("(//body[text()='Parent frame'])"));
		
		System.out.println(ParentFrameText.getText());
		
	////switching focus from parent frame to child frame	
		
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));  // for using frame by webelement method
		
	WebElement ChildFrameText = driver.findElement(By.xpath("//p[text()='Child Iframe']"));	
		
		System.out.println(ChildFrameText.getText());
		
driver.switchTo().defaultContent();

       System.out.println(MainPageText.getText());
     
		
		
		
		
		
		
		
		
	}

}
