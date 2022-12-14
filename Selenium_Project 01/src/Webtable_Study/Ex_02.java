package Webtable_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_02 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
			     
	    driver.get("https://vctcpune.com/selenium/practice.html");	
		
	//  I need to pickup rows----->>> varying from 2>>11
	    
	   for (int i=2;i<=11;i++)
	   {
		 // row pick up column from perticular row---->> varying from 1>>3
		   for(int j=1;j<=3;j++)
		   {
			   String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
			   System.out.println(text+" ");
		   }
		   System.out.println();
		   

	   }
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
