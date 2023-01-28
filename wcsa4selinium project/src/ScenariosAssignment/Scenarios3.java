package ScenariosAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenarios3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQiAtbqdBhDvARIsAGYnXBOl0pPQ-NKPgAuBweOSlCz8i6Nve4Z32T2TjkBEQJeGNUi9LJBPOlwaAnPoEALw_wcB");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
	}

}
