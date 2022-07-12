package assertusedinTng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class VerifyRadioButton {
  @Test
  public void myMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement radioButton1=driver.findElement(By.xpath("//input[@value='Radio1']"));
//		if(radioButton1.isSelected())
//		{
//			Reporter.log("TC pass Radio Button is selected",true);
//			
//		}
//		else {
//			Reporter.log("TC pass Radio Button is selected",true);
//			
//		}
		Assert.assertTrue(radioButton1.isSelected(),"Radio button is not selected TC is failed");
  }
}
