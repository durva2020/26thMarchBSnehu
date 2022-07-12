package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag.drop.html");
//file source and destination
		WebElement source=driver.findElement(By.xpath("//a[text()='5000']"));
		WebElement destination=driver.findElement(By.id("amt8"));
		//how to drag and drop using Action class
		//create object of Action class and pass driver object
		Actions act =new Actions(driver);
		//by using actions class methods perform desired action
		//act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		act.dragAndDrop(source, destination).perform();
	}

}
