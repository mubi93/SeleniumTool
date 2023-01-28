package cssSelectorassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olacabs.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("text")).sendKeys("pune");
		driver.findElement(By.className("value text")).sendKeys("mumbai");
		driver.findElement(By.cssSelector("hamburger event-elem")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		
}

}

	
