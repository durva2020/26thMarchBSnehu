package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
List<WebElement> links = driver.findElements(By.tagName("a"));
System.out.println(links.size());
Iterator<WebElement> it = links.iterator();
while(it.hasNext())
{
	System.out.println(it.next().getText());
}
	}

}
