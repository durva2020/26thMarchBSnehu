package includeanExclude;

import org.testng.annotations.Test;
import org.testng.Reporter;


public class MyTestClass2 {
  @Test
  public void x() {
	  Reporter.log("x running",true);
  }
  @Test
  public void y() {
	  Reporter.log("x running",true);
  }
  @Test
  public void z() {
	  Reporter.log("x running",true);
  }
}
