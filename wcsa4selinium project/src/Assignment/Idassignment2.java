package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idassignment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("location")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.className("_3iFC5")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
	}



