package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTestValidCred {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://mubin/login.do");
		for(int i=0; i<1; i++)
		{
		 FileInputStream fis = new FileInputStream("./data/Test Data.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("validcreds");
		 Row row = sheet.getRow(i);
		 Cell cell = row.getCell(0);
		 String username = cell.getStringCellValue();
		 
		 
		WebElement username1 = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("pwd"));
	
		
	}

}
}
