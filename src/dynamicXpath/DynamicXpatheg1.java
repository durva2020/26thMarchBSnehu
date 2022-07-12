package dynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicXpatheg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(200);
     Actions act = new Actions(driver);
      driver.findElement(By.name("q")).sendKeys("SAMSUNG Galaxy F12");
      act.sendKeys(Keys.ENTER).perform();
      Thread.sleep(2000);
     
   String review =driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
  System.out.println(review);
      }

}
