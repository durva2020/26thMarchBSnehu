package setPosiAndSetSize;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getPosition());
		//to set position we need to create object of point class and pass x and y coordinate
Point p= new Point(200,10);
//using set position method we can set the browser position
driver.manage().window().setPosition(p);
	}

}
