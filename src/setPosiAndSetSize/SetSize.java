package setPosiAndSetSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://facebook.com/");
			Thread.sleep(2000);
			System.out.println(driver.manage().window().getSize());
			//to set size,need to create object of dimension class and pass width and height
			Dimension d=new Dimension(1111,100);
			//using set size method we can set size
			driver.manage().window().setSize(d);

	}

}
