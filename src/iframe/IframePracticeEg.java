package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframePracticeEg {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
Thread.sleep(1000);
//main page
String text=driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
System.out.println(text);

String text1=driver.findElement(By.xpath("//label[@style='font-size:40px']")).getText();
System.out.println(text1);

driver.switchTo().frame(0);//by index
driver.findElement(By.xpath("(//input)[1]")).sendKeys("IFrame");

driver.switchTo().frame("frame3");//switch to frame3
driver.findElement(By.xpath("//input[@type='checkbox']")).click();

//switch to frame2
driver.switchTo().defaultContent();
driver.switchTo().parentFrame();
driver.switchTo().frame("frame2");
WebElement element=driver.findElement(By.id("animals"));
Select s=new Select(element);
s.selectByValue("babycat");




	}

}
