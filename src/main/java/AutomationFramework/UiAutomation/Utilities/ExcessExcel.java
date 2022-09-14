package AutomationFramework.UiAutomation.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcessExcel {
	
	@SuppressWarnings("resource")
	@DataProvider(name="abc", parallel=true)
	public Object[][] ExcelData() throws Exception 
	{
		System.out.println("excel is called");
		FileInputStream fis = new FileInputStream("C:\\Users\\Abhishek\\Desktop\\E.xlsx");
		
			
		XSSFWorkbook WorkBook = new XSSFWorkbook (fis);
		
		XSSFSheet sheet=WorkBook.getSheet("Sheet1");
		Row row=sheet.getRow(0);
		int lastRowNumber=sheet.getLastRowNum()+1;
		int lastCell=row.getLastCellNum();
		System.out.println(lastRowNumber);
		System.out.println(lastCell);
		String[][] a=new String[lastRowNumber][lastCell];
		
		for(int i=0;i<lastRowNumber;i++) {
			for(int j=0;j<lastCell;j++)
			{
				row = sheet.getRow(i);
	        	Cell cell = row.getCell(j);
	        	String value=cell.getStringCellValue();
	        	a[i][j]=value;
			}
			System.out.println(a);
		}
		
		return a;
	}

}
