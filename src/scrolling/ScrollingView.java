package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingView {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));//10000
		 WebElement katraj=driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		JavascriptExecutor e = (JavascriptExecutor)driver;
e.executeScript("arguments[0].scrollIntoView(true)",katraj);
	}

}
