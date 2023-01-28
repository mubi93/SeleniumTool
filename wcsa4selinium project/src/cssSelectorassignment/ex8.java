package cssSelectorassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://integrator.actitime.com/auth/at");
		Thread.sleep(2000);
		driver.findElement(By.name("actiTimeUrl")).sendKeys("mubin12345");
		driver.findElement(By.name("username")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys("lucifer123@4");
		driver.findElement(By.cssSelector("button[class]")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		
}

}

	



