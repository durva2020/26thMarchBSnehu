package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	//data members
	@FindBy(id="userid") private WebElement userName;
	@FindBy(id="password")private WebElement passWord;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	//constructor
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//methods
	public void sendUserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	public void sendPassword(String Pass)
	{
		passWord.sendKeys(Pass);
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}
