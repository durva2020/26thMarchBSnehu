package crossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralelCrossBrowsertest {
	@Parameters("browserName")
	  @Test
	  public void myMethod(String name) throws InterruptedException {
			WebDriver driver =null;
			if(name.equals("firefox")) {
				 System.setProperty("webdriver.gecko.driver","C:\\Users\\shree\\eclipse-workspace\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				 driver= new FirefoxDriver();
			}
			else if(name.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
				 driver= new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(2000);
			driver.close();
			
			
	  }
	}
