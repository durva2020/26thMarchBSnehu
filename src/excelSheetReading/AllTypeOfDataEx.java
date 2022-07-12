package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllTypeOfDataEx {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\shree\\eclipse-workspace\\ExcelSheet.xlsx");
		Sheet mySheet=WorkbookFactory.create(myfile).getSheet("Sheet1");
		int TotalNoRows=mySheet.getLastRowNum();
		int rowCount=TotalNoRows;
		System.out.println("Total no of Rows are:" +rowCount);
		System.out.println("=======================================");
		
		
		short TotalNoCell=mySheet.getRow(TotalNoRows).getLastCellNum();
		int cellCount=TotalNoCell-1;
		System.out.println("Total no of cell are:" +cellCount);
		System.out.println("=================================");
		
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<=cellCount;j++)
			{
				Cell cellValue=mySheet.getRow(i).getCell(j);
				CellType dataType=cellValue.getCellType();
				if(dataType==CellType.STRING)
				{
					String value=cellValue.getStringCellValue();
					System.out.println(value+" ");
					
				}
				else if(dataType==CellType.NUMERIC)
				{
					double value=cellValue.getNumericCellValue();
					System.out.println(value+" ");
					
				}
				else if(dataType==CellType.BOOLEAN)
				{
					Boolean value=cellValue.getBooleanCellValue();
					System.out.println(value+" ");
				}
				else if(dataType==CellType.BLANK)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
