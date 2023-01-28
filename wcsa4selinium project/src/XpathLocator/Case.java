package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=-VvQKEvsPpE");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//div[@class='container-fluid']")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
		
		
	

