package Neostox_Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {

	
		
        // commonly used method
		
		// screenshot ; wait ; scrolling excel reading

	public static  String readExcelData(int row,int cell) throws EncryptedDocumentException, IOException
		{
			File myfile=new File("E:\\Excel\\Sample Example 01.xlsx");
		      
		 String	value =WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(row).getCell(cell).getStringCellValue();
			
			Reporter.log("reading data from excel",true);
			return value;
		}
		
		
	public static void screenshot(WebDriver driver, String screenshotName) throws IOException
		{
			
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File destination=new File("F:\\Software Testing Notes\\ScreenshotAS\\"+screenshotName+".png");
		
		 FileHandler.copy(source, destination);
		 Reporter.log("Taking Screenshot",true);
		 
		}
		
	public static void scrollIntoView(WebDriver driver, WebElement element)	
	{
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		 Reporter.log("ScrollingIntoView",true);
	}
		
		
	   public static void wait(WebDriver driver,int waitTime)
	   {
		   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		   Reporter.log("Waiting for"+waitTime+"ms",true);
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


