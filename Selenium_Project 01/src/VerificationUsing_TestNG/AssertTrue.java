package VerificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void testing()
  {
	  boolean a=true;
	  
	  Assert.assertTrue(a,"a is a false TC failed");
	  
	  
	  
	  
  }
}
