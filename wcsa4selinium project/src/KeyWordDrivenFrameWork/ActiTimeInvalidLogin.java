package KeyWordDrivenFrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimeInvalidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowse();
		Flib flib = new Flib();
		int rc=flib.rowCount(Excel_Path,"Invalidcreds");
		
		for(int i=1; i<=rc;i++)
		{
			String usn=flib.readExcelData(Excel_Path,"Invalidcreds",i,0);
			
			String pass=flib.readExcelData(Excel_Path,"Invalidcreds",i,1);
			
			driver.findElement(By.name("username")).sendKeys(usn);
		    driver.findElement(By.name("pwd")).sendKeys(pass);
		    driver.findElement(By.id("loginButton")).click();
		    Thread.sleep(2000);
		   driver.findElement(By.name("username")).clear();
		    
		    

		}
		bt.closBrowse();
		driver.quit();
	}
	

}
