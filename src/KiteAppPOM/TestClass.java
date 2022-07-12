package KiteAppPOM;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\shree\\eclipse-workspace\\ExcelSheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String UN = mySheet.getRow(4).getCell(0).getStringCellValue();
		String PWD=mySheet.getRow(4).getCell(1).getStringCellValue();
	    String PIN =mySheet.getRow(4).getCell(2).getStringCellValue();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		KiteLoginPage login = new KiteLoginPage(driver);
		login.sendUserName(UN);
		login.sendPassword(PWD);
		login.clickOnLoginButton();
		Thread.sleep(4000);
		System.out.println("===============================");
		KitePinPage pin = new KitePinPage(driver);
		pin.sendPin(PIN);
		pin.clickOnContinueButton();
		Thread.sleep(4000);
		System.out.println("===============================");
		KiteHomePage home=new KiteHomePage(driver);
		home.validateUserName(UN);
		home.clickOnLogBut();
		driver.close();
	
		
	}

}
