package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
Thread.sleep(1000);
WebElement element=driver.findElement(By.name("cars"));
Select s=new Select(element);
System.out.println("here is multiselect option" +s.isMultiple());
Thread.sleep(1000);
s.selectByValue("volvo");
Thread.sleep(100);
s.selectByVisibleText("Saab");
Thread.sleep(100);
s.selectByIndex(2);
Thread.sleep(100);
s.selectByIndex(3);
Thread.sleep(100);

s.deselectAll();
//Thread.sleep(100);
//s.deselectByIndex(3);
//Thread.sleep(100);
//s.deselectByIndex(2);
//Thread.sleep(100);
//s.deselectByVisibleText("saab");
//Thread.sleep(100);
//s.deselectByValue("volvo");

//System.out.println(s.getFirstSelectedOption().getText());
s.getAllSelectedOptions();


	}

}
