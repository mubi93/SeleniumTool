package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmInvalidLogin {public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome,driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	 Flib flib = new Flib();
	 int rc=flib.rowCount("./data/OrangeHrm.xlsx","validcreds");
	 for(int i=1; i<=rc; i++)
	 {
	 
	 
		 String username = flib.readExcelData("./data/OrangeHrm.xlsx","Invalidcreds", i, 0);
		 String password = flib.readExcelData("./data/OrangeHrm.xlsx","Invalidcreds", i, 1);
		 
		 WebElement usn1 = driver.findElement(By.name("username"));
		 usn1.sendKeys("username");
		 Thread.sleep(2000);
		 WebElement pass1 = driver.findElement(By.name("password"));
		
		pass1.sendKeys("password");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).clear();
		 Thread.sleep(2000);
		 
		 
		 

	 }
}
}






