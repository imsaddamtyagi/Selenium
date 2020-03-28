package excellFilesOpn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	

	public static void main(String[] args) throws IOException   {
		
		File fs = new File("D:\\Sofiya\\SeleniumData\\DataForForms.xlsx");  // Path of File.
		
		FileInputStream fis = new FileInputStream(fs);  // Load file.
		
		XSSFWorkbook xwb = new XSSFWorkbook(fis);     //Load WorkBook.     //XSSF for Excel 2007 onwards.[HSSF used for Excel 2003 or earlier.]
		
		XSSFSheet sh1 = xwb.getSheetAt(0);          // Load sheet-   Here we are loading first sheet only at 0 index. WTH of Workbook.
		
		// getRow() specify which row we want to read.
	   //  getCell() specify which column to read.
	  //   getStringCellValue() specify that we are reading String data.
	             
		int row = sh1.getLastRowNum(); // To get numbers of Rows in Excel Sheet.
		int column = sh1.getRow(row).getPhysicalNumberOfCells();
	
		for(int i=0;i<=row;i++)
		{
		for(int j=0;j<column;j++)
		{
		System.out.print(sh1.getRow(i).getCell(j).getStringCellValue()+"  ");		
		}
		System.out.println();
		}
		
		xwb.close();
	
		}
}

