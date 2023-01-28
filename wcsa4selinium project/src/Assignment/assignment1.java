package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/auth?redirect=https%3A%2F%2Fwww.meesho.com%2F&source=profile&entry=header&screen=HP");
		Thread.sleep(2000);
		driver.findElement(By.name("tel")).sendKeys("7038770883");
		Thread.sleep(2000);
		driver.findElement(By.className("sc-iCfLBT gQwGKX")).click();
		Thread.sleep(2000);
		driver.close();
	}



	}

