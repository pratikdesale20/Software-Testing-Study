package excelReding;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Eg03 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile=new File("E:\\Excel\\Sample Example 01.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		
		// how to read whole row from Excel
		
	for(int i=0;i<=3;i++)                              // cell column reads value from starting index 0-1-2-3 like that
	{
		String value = mysheet.getRow(2).getCell(i).getStringCellValue();
		System.out.print(value+"  ");
	}
	System.out.println();
		
System.out.println("==============================================================================================");

    // how to read whole cell from excel

     for(int i=5;i<=10;i++)
     {
    	 //String value2 = mysheet.getRow(i).getCell(2).getStringCellValue();
    	  double value2 = mysheet.getRow(i).getCell(1).getNumericCellValue();
    	 System.out.print(value2+"  ");
     }
       System.out.println();








		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
