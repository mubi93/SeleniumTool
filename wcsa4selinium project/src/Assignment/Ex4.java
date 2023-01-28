package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://app.joinsuperset.com/#/s/feed");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("mubinmulla2269@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Mubin7038770883");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='btn btn-primary btn-block'])[1]")).click();
		driver.findElement(By.xpath("//button[@title='Skip']")).click();
		
		
		
	}

}
