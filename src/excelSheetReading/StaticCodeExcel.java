package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StaticCodeExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\shree\\eclipse-workspace\\ExcelSheet.xlsx");
		 Workbook book=WorkbookFactory.create(myfile);
		  Sheet mySheet=book.getSheet("Sheet1");
		 Row myRow= mySheet.getRow(1);
		 Cell myCell=myRow.getCell(0);
		 System.out.println(myCell.getCellType());
		 System.out.println("=================Static code=======");
		 //code for reding whole data from excel sheet
		 Sheet mySheet2=book.getSheet("Sheet2");
		 for(int i=0;i<=4;i++){//outer for loop
			 for(int j=0;j<=1;j++) {//inner for loop
String value=mySheet2.getRow(i).getCell(j).getStringCellValue();
System.out.println(value+" ");
				 
			 }
			 System.out.println();
		 }
		 System.out.println("=============Dynamic code=====");
		 

	}
	
	

}
