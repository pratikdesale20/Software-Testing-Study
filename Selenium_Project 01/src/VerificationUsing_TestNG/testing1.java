package VerificationUsing_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testing1 {
  @Test
  public void VerifyCheckPoint() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
      
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		     
		 driver.get("https://vctcpune.com/selenium/practice.html");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
	WebElement CheckBox1 = driver.findElement(By.id("checkBoxOption1"));	 
	
//	if(CheckBox1.isSelected())
//	{		
//		Reporter.log("CheckBox is Selected TC is Passed",true);
//	}
//	else
//	{
//		Reporter.log("Checkbox is not Selected then TC is Fail",true);
//	}
 
	  
	CheckBox1.click();
	
	Assert.assertTrue(CheckBox1.isSelected(),"TC is Failed CheckBox is not selected");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
