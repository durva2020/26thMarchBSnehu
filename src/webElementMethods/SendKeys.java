package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://vctcpune.com/selenium/practice.html");
//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi sneha");
Thread.sleep(1000);
//driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
driver.findElement(By.xpath("//input[@value='Radio2']")).click();
	}

}
