package KeyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
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
     
     public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
     {
    	 FileInputStream fis=new FileInputStream(excelPath);
    	 Workbook wb = WorkbookFactory.create(fis);
    	 Sheet sheet = wb.getSheet(sheetName);
    	 Row row = sheet.getRow(rowCount);
    	 Cell cell=row.createCell(cellCount);
    	 cell.setCellValue(data);
    	 
    	 FileOutputStream fos=new FileOutputStream(excelPath);
    	 wb.write(fos);
     }
     public String readPropertyData(String propPath,String keyValue) throws IOException
     {
    	 FileInputStream fis=new FileInputStream(propPath);
    	 Properties prop=new Properties();
    	 prop.load(fis);
    	 String data=prop.getProperty(keyValue);
    	 return data;
    	 
	
	
	
	}

}
