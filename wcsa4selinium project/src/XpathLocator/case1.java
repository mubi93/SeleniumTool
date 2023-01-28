package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://timetracker.ctepl.com/actitime/login.do");
			
			
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(4000);
			driver.quit();
		}
}
			
			
			
		
	
