package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.bluestone.com/");
		//driver.findElement(By.id("confirmBtn")).click();
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		Thread.sleep(4000);
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(4000);
		driver.findElement(By.id("chat-icon")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("chat-fc-email")).sendKeys("mubinmulla2269@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("chat-fc-phone")).sendKeys("7038770883");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='fc-button']")).click();
	
		
		//driver.findElement(By.id("chat-icon")).click();
		
	}

}
