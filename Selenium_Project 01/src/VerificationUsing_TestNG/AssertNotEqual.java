package VerificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqual {
  @Test
  public void Testing() 
  {
	  
	  String a="Pune";
	  String b="Pune";
	  
	  Assert.assertNotEquals(a,b,"a & b are same then TC is Failed");
	  
  }
}
