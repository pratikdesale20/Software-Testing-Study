package upstoxUsing_Excel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Upstox_Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
				
		 driver.get("https://login-v2.upstox.com/");	 
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));		
		
	File myFile=new File("E:\\Excel\\Sample Example 01.xlsx")	;
	
	Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
	String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		
	String pass = mysheet.getRow(0).getCell(1).getStringCellValue();
		
	String yob = mysheet.getRow(0).getCell(2).getStringCellValue();	
		
// create object of upstox Loginpage

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));	

	Login_Page1 log=new Login_Page1(driver);
		
	log.enterUserName(UN);
	log.enterPassWord(pass);
	log.clickOnLoginButton();
	
	
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));	
	 	
//     create object for passcode page
		
	 PasscodePage Passcode=new PasscodePage(driver);	
		
	 Passcode.sendpasscode(yob)	;
		
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

//		create object of welcome page		
		
	 WelcomePage welcome=new WelcomePage(driver);
	 
	 welcome.ClickOnIAmGoodButton();
		
	 
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));		
		
// create object of homepage		
		
		HomePage HP=new HomePage(driver);
				
		HP.ValidateUsername(mysheet.getRow(0).getCell(3).getStringCellValue(), driver);
		

		
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));		
		
		log.logOutBotton();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
