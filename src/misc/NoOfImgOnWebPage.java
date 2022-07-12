package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfImgOnWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("honda");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Images']")).click();
        List<WebElement> imges = driver.findElements(By.tagName("img"));
        System.out.println(imges.size());
      
	}
}

