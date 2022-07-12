package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(25000);
driver.findElement(By.name("firstname")).sendKeys("Sneha");
Thread.sleep(10000);
driver.findElement(By.name("lastname")).sendKeys("Shinde");
Thread.sleep(10000);
driver.findElement(By.name("reg_email__")).sendKeys("7822920038");
Thread.sleep(10000);
driver.findElement(By.name("reg_passwd__")).sendKeys("Sneha@123");
Thread.sleep(10000);
//driver.findElement(By.xpath("(//div[text()='Date of birth'])")).click();
WebElement birthDay=driver.findElement(By.name("birthday_day"));
Select s=new Select(birthDay);
s.selectByVisibleText("1");
Thread.sleep(100);
WebElement birthMonth=driver.findElement(By.id("month"));
Select s1=new Select(birthMonth);
s1.selectByVisibleText("Sep");
Thread.sleep(100);
WebElement birthYear=driver.findElement(By.id("year"));
Select s2=new Select(birthYear);
s2.selectByVisibleText("1995");
Thread.sleep(100);
driver.findElement(By.xpath("//label[text()='Female']")).click();
Thread.sleep(100);
//driver.findElement(By.xpath(("//a[text()='Cookie Policy']"))).click();
//Thread.sleep(10000);
WebElement button=driver.findElement(By.name("websubmit"));
button.click();



	}

}
