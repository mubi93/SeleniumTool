package cssSelectorassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.snapchat.com/accounts/login?continue=%2Faccounts%2Fwelcome");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("mubin");
		driver.findElement(By.name("password")).sendKeys("mubin152@$123");
	    driver.findElement(By.cssSelector("button[class]")).click();
		
		
		
		
		
}
}

	



	


