package assertusedinTng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod() {
	  String a="Sneha";
	  String b="Sneha";
//	  Assert.assertEquals(a, b,"a & b values are not matching TC failed");
//	  Reporter.log("a and b values are not matching TC passed",true);
	  Assert.assertNotEquals(a, b,"a & b values are matching TC failed");
	  Reporter.log("a and b values are not matching TC passed",true);
  }
}
