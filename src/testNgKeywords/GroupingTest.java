package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingTest {
  @Test (groups={"sanity"})  
  public void f() {
	  Reporter.log("f is running",true);
	  
  }
  @Test
public void q() {
	  Reporter.log("q is running",true);
  }
  @Test(groups={"sanity"}) 
public void a() {
	  Reporter.log("a is running",true);
}
  @Test(groups={"sanity"}) 
public void d() {
	  Reporter.log("d is running",true);  
}
  @Test(groups={"regression"})
public void e() {
	  Reporter.log("e is running",true);  
}

}
