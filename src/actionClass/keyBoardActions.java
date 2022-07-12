package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		//find element
		driver.findElement(By.id("autocomplete"));
		//textBox.sendKeys("Good Morning");//using WebElement method
		//How to send keys using actions class
		//Create object of Actions class and pass driver object
		Actions act =new Actions(driver);
		//using sendKeys method of actions class perform SendKeys task
		CharSequence textBox = null;
		 act.sendKeys(textBox,"Good Morning").perform();
		//How to handle drop down actions class
		driver.findElement(By.name("dropdown-class-example"));
		WebElement dropDown = null;
		//using actions class method Handle drop down
		act.click(dropDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		

	}

}
