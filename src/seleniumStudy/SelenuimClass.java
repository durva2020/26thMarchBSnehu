package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenuimClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(1000);
//Types OF Locators
driver.get("https://vctcpune.com/selenium/practice.html");
driver.findElement(By.xpath("//input[@value='Radio1']")).click();
//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello sneha");
//driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
//driver.findElement(By.xpath("//select[@name='dropdown-class-example']")).click();

//XPATH BY TEXT

//driver.findElement(By.xpath("//a[contains(text(),'Open ')]")).click();
//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

}

}
