package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("https://www.discoveryplus.in/");
Thread.sleep(25000);
driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
Thread.sleep(10000);

driver.findElement(By.id("mobileNumber")).sendKeys("7822920038");
Thread.sleep(1000);
WebElement getOTPButton=driver.findElement(By.xpath("//button[text()='Get OTP']"));
System.out.println(getOTPButton.isEnabled());
getOTPButton.click();
Thread.sleep(30000);
driver.findElement(By.xpath("(//button[text()='Submit'])")).click();
//System.out.println(submitButton.isEnabled());
//submitButton.click();






	}

}
