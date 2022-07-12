package KiteBase;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.annotations.Test;

import Kiteutility.UtilityProp;


public class Base {
	protected static WebDriver driver;
	
	  @Test
	  public void OpenFirefoxBrowser() throws InterruptedException, IOException {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\shree\\eclipse-workspace\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			 driver= new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.get(UtilityProp.getDataFromPropertyFile("URL"));
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

			}
	  
	  public void OpenChromeBrowser() throws InterruptedException, IOException	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver_win32 (1)\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(UtilityProp.getDataFromPropertyFile("URL"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			
			
	  }
	
  
//  public void OpenBrowser() throws IOException {
//	 System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver_win32 (1)\\chromedriver.exe");
//		ChromeOptions opt=new ChromeOptions();
//		//opt.addArguments("headless");
//		opt.addArguments("disable-notifications");
//		opt.addArguments("incognito");
//	     driver= new ChromeDriver();
//		 driver.manage().window().maximize();
//		 driver.get(UtilityProp.getDataFromPropertyFile("URL"));
//		 Reporter.log("Launching browser",true);
//		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//  }
//  
}
