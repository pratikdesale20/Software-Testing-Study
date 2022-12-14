package VerificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void Testing()
  {
	  String a="Pratik";
	  
	  Assert.assertNotNull(a,"a is null then TC is Failed");
  }
  
}
