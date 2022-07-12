package Kiteutility;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.Base;

public class Listener extends Base implements ITestListener{
	//WebDriver driver;
	 public void onTestSuccess(ITestResult result) {
		 Reporter.log("Congratulation Your TC is PASED,Passed Tc name is "+result.getName(),true);
	 }
	public void onTestFailure(ITestResult result) {
		Reporter.log("SORRY Your TC is FAILED,Failed Tc name is "+result.getName(),true);
		 String name=result.getName();
		try {
			UtilityProp.captureScreenshot(driver, name);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
