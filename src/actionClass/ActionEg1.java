package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEg1 {
public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				Thread.sleep(20000);
				WebElement seleniumButton=driver.findElement(By.linkText("Selenium"));
				//seleniumButton.click();//--->using webelement method
				//how to click using actions class and pass driver object
				Actions act=new Actions(driver);
				//using one the required actions complete the process
				act.moveToElement(seleniumButton).perform();
				act.click().perform();
				//act.moveToElement(seleniumButton).click().build().perform();
				//act.click(seleniumButton).perform();
                 //how to right click(contextClick)using Actions class
				WebElement rightClickButton=driver.findElement(By.xpath("//button[text()='right click me']"));
				act.moveToElement(rightClickButton).contextClick().build().perform();
				act.contextClick(rightClickButton).perform();
				//how to double click using Action class
				 WebElement dubleClickButton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
				 act.moveToElement(dubleClickButton).doubleClick().build().perform();
				 act.doubleClick(dubleClickButton).perform();
				 
			}

		


	}

