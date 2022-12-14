package excelReding;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Eg04 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile=new File("E:\\Excel\\Sample Example 01.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet(null);
		
	// how to read whole data from excel 
		// vary rows----->>vary cells
		
	// outer for loop---->> rows 0--1,2,3
		
		for (int i=0;i<=2;i++)
		{
		     // inner for-loop --->> cells  0-->1,2,3
			
			for(int j=0;j<=3;j++)
			{
				String value03 = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value03+"  ");
			}
			System.out.println();
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
