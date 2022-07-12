package TestNGUse;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Test;

public class ExcelSheetDataTn {
	
	WebDriver driver;
	String UN;
	Sheet mySheet;
	String UserId;
	File myfile;

	
	
 @Test
  public void Test() throws EncryptedDocumentException, IOException, InterruptedException {
	  File myfile=new File("C:\\Users\\shree\\eclipse-workspace\\ExcelSheet.xlsx");
		 mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String UN = mySheet.getRow(4).getCell(0).getStringCellValue();
		String PWD=mySheet.getRow(4).getCell(1).getStringCellValue();
	    String PIN =mySheet.getRow(4).getCell(2).getStringCellValue();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
driver.findElement(By.id("userid")).sendKeys(UN);
driver.findElement(By.id("password")).sendKeys(PWD);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.id("pin")).sendKeys(PIN);
driver.findElement(By.xpath("//button[@type='submit']")).click();
 
	
 }
	 @Test
	 public void ValidateUsername() throws InterruptedException, EncryptedDocumentException, IOException {
mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
  String UN = mySheet.getRow(4).getCell(0).getStringCellValue();
	 String actualUserName=UserId;
	  	Assert.assertEquals(UN, actualUserName,"UserId is not matching TC Failed");
	  	Reporter.log("expectedUserName and actualUserName are matching then TC is Pass",true);
	  	
	  	Thread.sleep(1000);
	  	 driver.findElement(By.id("avatar-84")).click();
	 driver.findElement(By.xpath("//a[text()=' Logout']")).click();
	 Reporter.log("Application logout",true);
 
  	
	 Reporter.log("browser close",true);
	 driver.close();

 }
}

 
  

