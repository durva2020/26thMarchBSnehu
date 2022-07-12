package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingBySides {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		//+ve x value---> right hand side, y value +ve--->down
		//+ve x value---> right hand side, y value -ve---->up
		//+ve x value---> left hand side,y value +ve---->down
		//+ve x value---> left hand side,y value -ve--->up
		j.executeScript("window.scrollBy(80,900)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(80,2000)");
		//Thread.sleep(2000);
		j.executeScript("window.scrollBy(80,500)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(80,-2000)");
		Thread.sleep(2000);


		
		

	}

}
