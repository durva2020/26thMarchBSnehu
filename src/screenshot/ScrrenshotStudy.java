package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrrenshotStudy {

	public static void main(String[] args) throws InterruptedException, IOException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");

				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://kite.zerodha.com/");
				
				Thread.sleep(1000);
				
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				File destination= new File("D:\\Users\\shree\\Desktop\\screenshot\\myScreenShot1.png");

				FileHandler.copy(source, destination);
			}

		

	}


