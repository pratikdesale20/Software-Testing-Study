package excelReding;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Eg06 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File myFile=new File("E:\\Excel\\Sample Example 01.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		int totalNoOfRows = mySheet.getLastRowNum();
		
		int totalNoOfCells = mySheet.getRow(0).getLastCellNum()-1;
		
		
		
		// outer for-loop-----> Rows
		
		for(int i=0;i<=totalNoOfRows;i++)
		{
			// inner for-loop for ---->>>>> Cells
			
			for(int j=0;j<=totalNoOfCells;j++)
			{
			   CellType datatype = mySheet.getRow(i).getCell(j).getCellType();
				
				if(datatype==CellType.STRING)
				{
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+" ");
				}
				
				else if (datatype==CellType.NUMERIC)
				{
					double value1 = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value1+" ");
				}
				
				else if (datatype==CellType.BLANK)
				{
					System.out.println();
				}
				
				else if (datatype==CellType.BOOLEAN)
				{
					boolean value2 = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value2+" ");
					
				}
				
				System.out.println();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
