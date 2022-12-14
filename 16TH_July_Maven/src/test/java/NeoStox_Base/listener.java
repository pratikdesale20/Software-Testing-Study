package NeoStox_Base;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Neostox_Utility.UtilityNew;




public class listener extends Base1 implements  ITestListener
{
	
	public void onTestSuccess(ITestResult result)
	{   
	    String methodName = result.getName();
	    Reporter.log("TC "+methodName+" is completed successfuly",true);
	}
	
	public void onTestFailure(ITestResult result)
	{
		
		Reporter.log("TC "+result.getName()+"failed please try again....",true);
		
		try {
			   UtilityNew.Screenshot(driver, result.getName());
		}
		catch(IOException e)
		{
			e.printStackTrace();    
		}
		
		                                            
		
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC"+result.getName()+" Skipped please check...",true);
	}
	
	 
                    
	
	
}
