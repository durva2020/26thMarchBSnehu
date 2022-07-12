package includeanExclude;

import org.testng.annotations.Test;

import org.testng.Reporter;

public class IncludeExclude1 {
  @Test
  public void f() {
	  Reporter.log("Hello Snem",true);

  }
  @Test
  public void test() {
	  Reporter.log("Hello Snehamam",true);

  }
  @Test
  public void test1() {
  
  Reporter.log("Hello",true);

  }
}
