package testNgKeywords;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
  @Test(invocationCount=3)
  public void myTest() {
	  Reporter.log("Hello Sneha",true);
  }
  @BeforeMethod
  public void test() {
	  Reporter.log("Hello Snehamam",true);

  }
  @Test(priority=-2)//priority
  public void Z() {
	  Reporter.log("Z is runnning",true);
}
  @Test(priority=-1)//priority
  public void f() {
	  Reporter.log("f is runnning",true);
}
  @Test  //enabled
  public void d() {
	  Reporter.log("d is runnning",true);
}
  @Test(enabled=false)//EnabledUse
  public void q() {
	  Reporter.log("q is runnning",true);
}
  @Test(timeOut=1000)//timeout
  public void add() throws InterruptedException {
	  Thread.sleep(2000);
	  Reporter.log("Z is runnning",true);
}@Test //priority
public void sum() {
	//Assert.fail();
	  Reporter.log("Z is runnning",true);
}
@Test(dependsOnMethods= {"sum"},priority=-2)//priority
public void mul() {
	  Reporter.log("Z is runnning",true);
}
}
