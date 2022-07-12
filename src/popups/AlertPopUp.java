package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();//to handled alertpopupwe need to switch selenium focus from main page to alert popup by using syntax
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//driver.findElement(By.id("timerAlertButton")).click();

	}

}
