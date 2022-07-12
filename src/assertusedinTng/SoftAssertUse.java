package assertusedinTng;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod() {
	  String x="Latur";
	  String y="Latur";
	  SoftAssert soft=new SoftAssert();
	  soft.assertNotEquals(x,y,"Both values are equals TC is failed");
	  soft.assertNull(y,"value is not null,TC is failed");
	  
	  //soft.assertAll();
  }
  @Test
  public void testing() {
	  boolean a=true;
	  boolean b=false;
	  SoftAssert s=new SoftAssert();
	  s.assertTrue(b,"Value is false TC is failed");
	  s.assertFalse(a,"Value is True TC is failed");
	  //s.assertAll();
  }
}
