package kitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;

public class ValidateKiteAppUserName {
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
    KiteHomePage home;
    KitePinPage pin;
	
  @BeforeClass
  public void launchBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("headless");
		opt.addArguments("disable-notifications");
	  driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Reporter.log("Launching browser",true);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 File myfile=new File("C:\\Users\\shree\\eclipse-workspace\\ExcelSheet.xlsx");
		   mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
			login= new KiteLoginPage(driver);
            home = new KiteHomePage(driver);
            pin = new KitePinPage(driver);
  }
  @BeforeMethod
  public void loginToKiteApp() throws InterruptedException {
	    String UN = mySheet.getRow(4).getCell(0).getStringCellValue();
		String PWD=mySheet.getRow(4).getCell(1).getStringCellValue();
	    String PIN =mySheet.getRow(4).getCell(2).getStringCellValue();
	    login.sendUserName(UN);
	    Reporter.log("Sending Username",true);
	    login.sendPassword(PWD);
	    Reporter.log("Sending Password",true);
	    login.clickOnLoginButton();
	    Reporter.log("Clinking On Login Button",true);
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    pin.sendPin(PIN);
	    Reporter.log("Sending Pin",true);
	    pin.clickOnContinueButton();
	    Reporter.log("clicking on continue button",true);
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void validateUserName() {
	  String expectedUN=mySheet.getRow(4).getCell(0).getStringCellValue();
	  String actualUN=home.getActualUserName();
	    Reporter.log("Validating user name",true);
	    Assert.assertEquals(actualUN, expectedUN,"Actual and Expected UN are not matching TC failed");
	    Reporter.log("Actual and Expected UN are not matching TC passed",true);

  }
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException {
	  home.clickOnLogBut();
	  Reporter.log("logging out",true);
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  Reporter.log("closing browser",true);
	  //driver.close();
	  
	  
  }
}
