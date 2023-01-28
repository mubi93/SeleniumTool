package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByIndex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/mubin/OneDrive/Desktop/Frame.html");
		
		driver.findElement(By.id("id1")).sendKeys("Admin123");
		WebDriver pass = driver.switchTo().parentFrame();
	    driver.findElement(By.id("feid name=")).sendKeys("admin");
		
		
		
		
	}
}