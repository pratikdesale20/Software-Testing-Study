package PopUp_Study;

import java.util.Iterator;
import java.util.Set;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
        
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("https://skpatro.github.io/demo/links/");	
		
		String mainpageID = driver.getWindowHandle();
		
		
		System.out.println(mainpageID);
		
// clicking on new window button--> will open new child browser		
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allpages = driver.getWindowHandles();
		
		System.out.println(allpages);
		
////getting IDs of all pages
		
		Iterator<String> all = allpages.iterator();
		
		
		String idofmainpage = all.next();
		
	   String idofchildpage = all.next();	   
	 
	   

//we need to switch to child page		
		
		
	driver.switchTo().window(idofchildpage);
		
		driver.manage().window().maximize();
		
//current focus is on child page---> actions will be done on child page now		
		
		driver.findElement(By.id("the7-search")).sendKeys("good Afternoon");
		
		Thread.sleep(3000);
		
		
		driver.switchTo().window(idofmainpage);
		
		String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		
		System.out.println("Main Page Text "+myText);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
