package VerificationUsing_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_used {
 
	SoftAssert soft=new SoftAssert();   // created object of soft assert
	
	@Test
  public void testing() 
  
  {
	//if a and b are not equal and b is null then TC is passed
		
	  String a="abc";
	  String b=null;
	  
	  soft.assertNotEquals(a,b,"a and b are equals TC is failed");
	  
	  soft.assertNull(b,"b is not nul TC is failed");
  
  }
}
