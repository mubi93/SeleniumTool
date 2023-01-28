package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class   Flib {
	public String readExcelData(String excelpath1,String sheetName1,int rowCount,int cellCount1) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath1);
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName1);
		Row row= sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount1);
		String data = cell.getStringCellValue();
		
		   return data;
		   
		   
	}
     public int rowCount(String excelpath,String SheetName) throws EncryptedDocumentException, IOException
     {
    	 FileInputStream fis =new FileInputStream(excelpath);
    	 Workbook wb = WorkbookFactory.create(fis);
    	 org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(SheetName);
    	 int rc=sheet.getLastRowNum();
    	 return rc;
    	 
    	 
     }
     
}
