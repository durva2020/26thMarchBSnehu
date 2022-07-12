package navigateMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethods {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get -to enter url in browser or to open an application.
		driver.get("https://vctcpune.com/selenium/practice.html");
		//close-to close current tab of browser opened by selenium tool.
		driver.close();
		//quit-to close all browser tabs 
		driver.quit();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		//navigate methods-use to open an application,move forword,backward and refresh the webpage.
		driver.navigate().to("https//www.google.co.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//getTitle-get title of a web page return type is string.
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		System.out.println(title);
		
		//getCurrentURL-use to get url of a webpage rt string
		System.out.println(driver.getCurrentUrl());
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		

	}

}
