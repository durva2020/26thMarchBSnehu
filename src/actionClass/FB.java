package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		WebElement day =driver.findElement(By.id("day"));
		Actions act =new Actions(driver);
		act.click(day).perform();
		for(int i=1;i<=9;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(100);
		}
		act.sendKeys(Keys.ARROW_DOWN).perform();
		WebElement firstname =driver.findElement(By.name("firstname"));
		firstname.sendKeys("Sneha");
		act.keyDown(firstname,Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("neha").build().perform();
	}

}
