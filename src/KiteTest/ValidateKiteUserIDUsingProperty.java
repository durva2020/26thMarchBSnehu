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
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;
import KiteBase.Base;

import Kiteutility.UtilityProp;
@Listeners(Kiteutility.Listener.class)
public class ValidateKiteUserIDUsingProperty extends Base {
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	//String TCID="555";
	@Parameters("browserName")
	 @BeforeClass
	  public void lunchBrowser(@Optional String name) throws IOException, InterruptedException{
		  if(name.equals("chrome"))
		  {
			  OpenChromeBrowser();
		  }
		  else if(name.equals("firefox")){
			  OpenFirefoxBrowser();
			  
		  }
		 
		  login=new KiteLoginPage(driver);
		  home=new KiteHomePage(driver);
		  pin=new KitePinPage(driver);
	  }
	  @BeforeMethod
	  public void loginToKiteApp() throws EncryptedDocumentException, IOException {
		  login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
		  login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
		  login.clickOnLoginButton();
		  Reporter.log("Login succesfully==");
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
	      pin.clickOnContinueButton();
		  Reporter.log("pin enter  succesfully==");
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  
	  }
	  @Test
	  public void validateUserID() throws EncryptedDocumentException, IOException {
		  Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
		 // UtilityProp.captureScreenshot(driver,TCID);
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
