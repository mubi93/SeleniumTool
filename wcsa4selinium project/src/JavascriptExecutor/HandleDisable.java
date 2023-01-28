package JavascriptExecutor;

import java.time.Duration;

import org.apache.commons.exec.launcher.Java13CommandLauncher;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/mubin/OneDrive/Desktop/enabled.html");
		
		WebElement username = driver.findElement(By.id("i1"));
		WebElement password = driver.findElement(By.id("i2"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		System.out.println("for username Text Box");
		if(username.isEnabled())
		{
			username.sendKeys("admin");
			System.out.println("element is enabled");
		}
		else
		{
			js.executeScript("document.getElementById('i1').value='admin'");
			System.out.println("element is disabled");
			
		}
		Thread.sleep(2000);
		
		System.out.println("for password text box");
		if(password.isEnabled())
		{
			password.sendKeys("manager");
			System.out.println("element is enabled");
		}
		else
		{
			js.executeScript("document.getElementById('i2').value='manager'");
			System.out.println("elment is disabled");
		}
		
		
		
	}

}
