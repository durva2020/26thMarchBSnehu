package Kiteutility;

import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.Properties;
//import org.openqa.selenium.TakesScreenshot;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.io.FileHandler;


public class Utility {
	
  public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException {
	  File myfile=new File("C:\\Users\\shree\\eclipse-workspace\\ExcelSheet.xlsx");
	   Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	   String value=mySheet.getRow(row).getCell(cell).getStringCellValue();
	   return value;
	  
  }
}

