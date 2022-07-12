package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	@FindBy(xpath="//span[@class='user-id']")private WebElement userName;
	@FindBy(xpath="//a[text()=' Logout']")private WebElement logOutButton;
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}



public void validateUserName(String expectedUserID)
{
String expectedUserName="expectedUserID";
String actualUserName=userName.getText();
	if(expectedUserName.equals(actualUserName))
	{
		

		System.out.println("Actual and Expected User Id are matching Tc is passed");
	
	}
	else
	{
		System.out.println("Actual and Expected User Id are not matching Tc is failed");

	}
}
	//to get actual userName
	public String getActualUserName() {
	String actualUserName=userName.getText();
	return actualUserName;
	
		
	}


public void clickOnLogBut() throws InterruptedException {
	userName.click();
	Thread.sleep(200);
logOutButton.click();
}
}

	






