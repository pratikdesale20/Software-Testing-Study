package Upstox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUser_UsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
      System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();	
		
     driver.get("https://login-v2.upstox.com/");	 
     Thread.sleep(1000);	
		
File myFile=new File("E:\\Excel\\Sample Example 01.xlsx");
	
	Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
	String UI = mysheet.getRow(9).getCell(0).getStringCellValue();	
		
	WebElement UserID = driver.findElement(By.name("userId"));	

	UserID.sendKeys(UI);
	
	WebElement Password = driver.findElement(By.name("password"));
	
	Password.sendKeys(mysheet.getRow(6).getCell(2).getStringCellValue());
	
    driver.findElement(By.id("submit-btn")).click();
	
Thread.sleep(1000);

    driver.findElement(By.name("yob")).sendKeys("1991");
Thread.sleep(5000);

   driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();	
Thread.sleep(1000);		
		
   String ActualUN = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();  
   
   String ExpectedUN = "Rajendra J.";
   	
       if(ActualUN.equals(ExpectedUN))
   {
     	System.out.println("Username Matching TestCase Is Pass");
   }
       else
   {
     	System.out.println("Username not matcing Testcase is Fail");
   }	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
