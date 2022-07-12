package misc;

//import java.util.Iterator;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Try it Yourself']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Try it Yourself']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Try it Yourself']")).click();
        Thread.sleep(2000);
        
//       char[] multiID;
//	System.out.println(multiID);
//		String MainPageId;
//		//ArrayList al=new ArrayList(multiIds);
//        for(char a : multiID)
//        {
//        	System.out.println(a);
//        	if(!a.equals(MainPageId))
//        	{
//        		driver.switchTo().window(a);
//        		Thread.sleep(4000);
//        		driver.findElement(By.id("runbtn")).click();
//        	}
//        }
//        driver.switchTo().window(MainPageId);
//        driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
////        driver.findElement(By.xpath("(//a[text()='Try it Yourself']")).click();
////        driver.findElement(By.xpath("//a[text()='Try it Yourself']")).click();
//        

	}

}
