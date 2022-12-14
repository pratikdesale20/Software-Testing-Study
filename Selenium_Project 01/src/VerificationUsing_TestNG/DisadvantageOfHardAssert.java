package VerificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisadvantageOfHardAssert {
  @Test
  public void Testing()
  {
	  
	  String a="pratik";
	  String b=null;
	  
	  Assert.assertNotEquals(a, b,"a & b are equal TC is Failed");
	  
	  Assert.assertNotNull(b, "b is  null TC is Fail");
	  
	  
	  
  }
}
