package MethodOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://mubin/login.do");
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("manager");
		WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		passwordTextBox.sendKeys("Mubin");
		
		
		
		Thread.sleep(2000);
		usernameTextBox.clear();
		passwordTextBox.clear();
		
	}

}
