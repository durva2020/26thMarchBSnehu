package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create excel sheet and pass the path along with name and extension in file
		File myfile=new File("C:\\Users\\shree\\eclipse-workspace\\ExcelSheet.xlsx");
		//using workbookfactory class read excel sheet
		//how to read string value
String name=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(name);
//how to read numeric value
double number=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
System.out.println(number);
////how to read char value
String myChar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
System.out.println(myChar);
////how to read boolean value
boolean myValue=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
System.out.println(myValue);
}

}
