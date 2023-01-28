package ScenariosAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenarios11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();
		driver.findElement(By.xpath("//span[@data-p='offers,m']")).click();
		Thread.sleep(4000);
		//10% making charges
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[3]")).click();
		Thread.sleep(4000);
		driver.quit();
		
		
	}
	
}
