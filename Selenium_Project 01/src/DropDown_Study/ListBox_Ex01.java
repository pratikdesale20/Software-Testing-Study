package DropDown_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Ex01 {

	public static void main(String[] args) throws InterruptedException {

   System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
         
        WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();     
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	Thread.sleep(1000);
	
	//1.Identify list box to be handled and store it in reference variable
		
		WebElement dropbox = driver.findElement(By.id("dropdown-class-example"));
		
	//2.Create an object of Select class which will accept WebElement as argument	
		
		Select object= new Select(dropbox);
		
	//3.By using one of the select class methods we can select values form list box like 	
		
//		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		2. selectByIndex: selectByIndex(int arg0) 
//		3. selectByValue: selectByValue(String arg0)
			
		
		object.selectByVisibleText("Option1");
		
		Thread.sleep(1000);
		
		object.selectByIndex(1);
		
		Thread.sleep(500);
		
		object.selectByValue("option3");
		
System.out.println("=======================================================================");		
	
		System.out.println(object.getFirstSelectedOption().getText());
		
		System.out.println("multiple select "+object.isMultiple());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
