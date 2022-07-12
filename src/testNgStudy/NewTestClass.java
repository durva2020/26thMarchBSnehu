package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestClass {
  @Test
  public void myMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		Reporter.log("This Is first Testcase....",true);	
  }
  @Test
  public void myMethod1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		Thread.sleep(2000);
		Reporter.log("This Is second Testcase....",true);	
		
  }
  
}
