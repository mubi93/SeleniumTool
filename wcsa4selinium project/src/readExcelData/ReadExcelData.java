package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for(int i=1; i<6; i++)
		{
		   FileInputStream fis = new FileInputStream("./data/Test Data.xlsx");//provide the excel
		   Workbook wb = WorkbookFactory.create(fis);//make the file read
		   Sheet sheet = wb.getSheet("IPL");//ask for take sheet name
		   Row row = sheet.getRow(i);//get value of row
		   Cell cell = row.getCell(0);//get value of cell
		   String data = cell.getStringCellValue();//it will give the value present in the cell
		   System.out.println(data);
		   
		}
		
		
	}

}
