package VerificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqual {
 
@Test
  public void Testing() 
  {
	 String a="software";
	 String b="software1";
	 
	 //if both are same (equal) then TC should be pass
	 
	 Assert.assertEquals(a,b,"a & b are not matching then TC is Failed");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
