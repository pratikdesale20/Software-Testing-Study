package excelReding;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Eg02 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//  create a file class object and add excel sheet path along with file name and extension
		
		File myFile=new File("E:\\Excel\\Sample Example 01.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		Sheet mysheet = myWorkbook.getSheet("Sheet1");
		
		Row myrow = mysheet.getRow(0);
		
		Cell mycell = myrow.getCell(2);
		
		CellType mytype = mycell.getCellType();
		
		System.out.println(mytype);
		
		
		String value = mycell.getStringCellValue();
		
		System.out.println(value);
		
System.out.println("====================================================================");

		Cell mycell1 = myrow.getCell(3);
		
		CellType mytype1 = mycell1.getCellType();
		
		System.out.println(mytype1);
		
		boolean value2 = mycell1.getBooleanCellValue();
		
		System.out.println(value2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
