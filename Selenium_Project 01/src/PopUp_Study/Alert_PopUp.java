package PopUp_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");	
////clicking on pop up button it will show alert popup.		
		
		driver.findElement(By.id("alertButton")).click();
		
	Thread.sleep(1000);
//need to switch selenium focus from main page Alert popup
	
	     Alert alt = driver.switchTo().alert();
		
		 alt.accept();        // clicking on ok button
		
		 
		 
		WebElement text = driver.findElement(By.xpath("//div[text()='Alerts']"));
		
		
		System.out.println(text.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
