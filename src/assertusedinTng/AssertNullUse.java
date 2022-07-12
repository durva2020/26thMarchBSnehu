package assertusedinTng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void myMethod() {
	 //String a=null;
	  String b="Sneha";
//	  Assert.assertNull(a,"TC is failed value is not null");
//  Reporter.log("TC is passed value is null",true);
	  Assert.assertNotNull(b,"b value is null TC is failed");
	  Reporter.log("value is not null TC is passed",true);
	  //Assert.fail();
	  
	  
  }
}
