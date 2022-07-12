package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxUsingSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement checkBox1=driver.findElement(By.name("checkBoxOption1"));
		//checkBox1.click();
		if(checkBox1.isSelected())
		{
			System.out.println("checkBox is alredy selected");
		}
		else {
			checkBox1.click();
			System.out.println("checkBox is now selected");
		}
		

	}

}
