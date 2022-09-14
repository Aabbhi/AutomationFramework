package AutomationFramework.UiAutomation.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestTheExcel {

	public static void main(String[] args)  {

		System.out.println("excel is called");
		
		
		try {	
			FileInputStream fis = new FileInputStream("C:\\Users\\Abhishek\\Desktop\\E.xlsx");
		
		XSSFWorkbook WorkBook = new XSSFWorkbook (fis);
		XSSFSheet sheet=WorkBook.getSheet("Sheet1");
		Row row=sheet.getRow(0);
		int lastRowNumber=sheet.getLastRowNum()+1;
		
	
		
		
		int lastCell=row.getLastCellNum();
		String[][] a=new String[lastRowNumber][lastCell];
		
		for(int i=1;i<lastRowNumber;i++) {
			for(int j=0;j<lastCell;j++)
			{
				row = sheet.getRow(i);
	        	Cell cell = row.getCell(j);
	        	String value=cell.getStringCellValue();
	        	a[i][j]=value;
	        	System.out.println(a[i][j]);
			}
			System.out.println(a);
		}
		WorkBook.close();
		}
		catch(Exception E)
		{
			E.printStackTrace();
			E.getCause();
			E.getMessage();
			E.getStackTrace();
		
		}
		
		
	}

}
