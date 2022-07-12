package FbAppTest;



import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbAppUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException  {
		File myfile=new File("C:\\Users\\shree\\eclipse-workspace\\ExcelSheet.xlsx");
		Sheet mySheet=WorkbookFactory.create(myfile).getSheet("Sheet2");
	String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
	String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement userID = driver.findElement(By.id("email"));
		WebElement passWord = driver.findElement(By.name("pass"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		userID.sendKeys(UN);
		passWord.sendKeys(PWD);
		loginButton.click();
		Thread.sleep(1000);
		WebElement userName=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy'"));
		String actualUserID = userName.getText();
		String expectedUserID=UN;
		if(actualUserID.equals(expectedUserID))
		{
		System.out.println("User ID matching TC is PASSED");
		}
		else {
		System.out.println("User ID not matching TC is FAILED");
		}
		userName.click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(3000);
		driver.close();
		}

	}


