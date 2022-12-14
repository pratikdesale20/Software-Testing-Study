package VerificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void testing() {
	  
	//  String a="hello";
	  String b=null;
	  
	  Assert.assertNull(b, "b are not null then TC is Failed");
	
	//  Assert.assertNull(a,"a are not null then TC is failed");
	  
	  
  }
}
