package dataDrivenFramework;

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
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://mubin/login.do");
		for(int i=1; i<=1; i++)
		{
		Flib flib = new Flib();
		String username=flib.readExcelData("./data/ActiTime.xlsx","validcreds",i,0);
		String password = flib.readExcelData("./data/ActiTime.xlsx","validcreds", i,1 );
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.id("loginButton")).click();
		
		}
	}
}
   