package TestNGUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
 
  WebDriver driver;
  public String baseUrl="https://kite.zerodha.com/";

	@BeforeClass
	  public void launchBrowser()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
        driver.get(baseUrl);
			driver.manage().window().maximize();
			Reporter.log("Browser is Launch",true);
			 }
@BeforeMethod
public void loginToKiteApp()   {
	 		driver.findElement(By.id("userid")).sendKeys("ELR321");
	  driver.findElement(By.id("password")).sendKeys("Dhana1111");
		Reporter.log("pass and userid entered",true);
}

@Test
public void submitButton() {
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Reporter.log("LoginKite Sucessfully",true);
	  }
@AfterMethod
public void pinPageKiteApp() throws InterruptedException {
	 Thread.sleep(2000);
driver.findElement(By.id("pin")).sendKeys("982278");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Reporter.log("pin entered Sucessfully",true);
		 Thread.sleep(2000);
		 driver.findElement(By.id("avatar-84")).click();
		 driver.findElement(By.xpath("//a[@target='_self']")).click();
		  Reporter.log("logout Sucessfully",true);
}

@AfterClass
public void closeBrowser() throws InterruptedException {
	  Thread.sleep(2000);
driver.close();
Reporter.log("browserclose Sucessfully",true);


}

}
