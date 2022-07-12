package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollinIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		 WebElement Ref=driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		 JavascriptExecutor js=((JavascriptExecutor)driver);
		 Thread.sleep(3000);
		 js.executeScript("arguments[0].scrollIntoView(true);",Ref);
		 //js.excuteScript("arguments[0].scrollIntoView(true);",referenceElement);

	}

}
