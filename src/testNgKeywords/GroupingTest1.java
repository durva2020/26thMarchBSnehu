package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingTest1 {
  @Test(groups= {"regression"})
  public void v() {
	  Reporter.log("v is running",true);
  }
  @Test(groups= {"sanity"})
  public void g() {
	  Reporter.log("g is running",true);
  }
  @Test(groups= {"regression"})
  public void l() {
	  Reporter.log("l is running",true);
  }
  @Test(groups= {"sanity"})
  public void c() {
	  Reporter.log("c is running",true);
  }
}
