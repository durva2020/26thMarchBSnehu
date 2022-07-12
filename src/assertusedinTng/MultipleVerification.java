package assertusedinTng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void myMethod() {
	  String a="Sneha1";
	  String b="Sneha";
	  Assert.assertNotEquals(a, b,"a & b values are equal TC is failed ");
	  
	  Assert.assertNotNull(b,"TC is failed value is null");
	  Assert.assertEquals(a, b,"a & b values are not equals TC is passed");
	  
  }
}
