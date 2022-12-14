package excelReding;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Eg05 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		File myFile=new File("E:\\Excel\\Sample Example 01.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		int LastRowNum = mySheet.getLastRowNum();
		
		System.out.println("Last row number is "+LastRowNum);
		
int totalNoOfRows = LastRowNum;		
		
		System.out.println("Total number of rows are "+totalNoOfRows);
		
System.out.println("========================================================================");		
		
      short LastCellNum = mySheet.getRow(0).getLastCellNum();
      
      System.out.println("last cell number is "+LastCellNum);

int totalNumOfCells = LastCellNum-1;

      System.out.println("Total Number of cell "+totalNumOfCells);

System.out.println("=======================================================================");

     // for-loops

     // outer for-loop for --->> Rows

    for(int i=0;i<=totalNoOfRows;i++)
    {
    	// inner for-loop for --->> Cells
    	
    	for(int j=0;j<=totalNumOfCells;j++)
    	{
    	    System.out.print(mySheet.getRow(i).getCell(j).getStringCellValue()+"  ");	
    	}
    	System.out.println();
    	
    }


























	}

}
