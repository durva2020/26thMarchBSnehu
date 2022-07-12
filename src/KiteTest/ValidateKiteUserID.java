package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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
import KiteBase.Base;
import Kiteutility.Utility;

public class ValidateKiteUserID extends Base {
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	
  @BeforeClass
  public void lunchBrowser() throws IOException {
	 // OpenBrowser();
	  login=new KiteLoginPage(driver);
	  home=new KiteHomePage(driver);
	  pin=new KitePinPage(driver);
  }
  @BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException {
	  login.sendUserName(Utility.readDataFromExcel(4, 0));
	  login.sendPassword(Utility.readDataFromExcel(4, 1));
	  login.clickOnLoginButton();
	  Reporter.log("Login succesfully==");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendPin(Utility.readDataFromExcel(4, 2));
      pin.clickOnContinueButton();
	  Reporter.log("pin enter  succesfully==");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
  }
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException {
	  Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(4, 0),"Actual and Expected are not matching Tc is failed");
	  Reporter.log("Actual and Expected Username are matching,TC is Passed",true);
  }
  @AfterMethod
  public void logOutFromKite() throws InterruptedException
  {
	  home.clickOnLogBut();
	  Reporter.log("Logout Lite App Sucessfully");

  }
  @AfterClass
  public void closeBrowser() {
	  driver.close();
	  
  }
  
}
