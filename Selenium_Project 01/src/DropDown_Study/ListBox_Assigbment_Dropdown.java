package DropDown_Study;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Assigbment_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();

	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
	Thread.sleep(2000);
;	
	   WebElement Daydropdown = driver.findElement(By.id("day"));
		
		Select s=new Select(Daydropdown);
		
		s.selectByValue("3");
		
System.out.println("===========================================================================================");		
	// how many days are there in Facebook UI ?
		    List<WebElement> days = s.getOptions();
		    
	// so to travsing inside the days.........we used loops like for,each-for,iterator etc	
		
		   for(WebElement d:days)
		   {
			   System.out.println(d.getText());
		   }
	   
	System.out.println("==============================================================================");
	
	     WebElement MonthDropbox = driver.findElement(By.id("month"));
		
		 Select M=new Select(MonthDropbox);
		 
		 M.selectByVisibleText("Mar");
		
	// how many Months are there in Facebook UI ?
		
		List<WebElement> month = M.getOptions();
		
		for (int i=0;i<=month.size()-1;i++)    
		{
			System.out.println(month.get(i).getText());
		}
		
System.out.println("======================================================");

		for (WebElement Q:month)
		{
			System.out.println(Q.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
