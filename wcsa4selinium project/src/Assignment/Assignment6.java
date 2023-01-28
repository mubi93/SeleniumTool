package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ind vs sl");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		//driver.findElement(By.xpath("(//img[@class='yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded'])[1]")).click();
		
		//driver.findElement(By.xpath("//iframe[@name='passive_signin']")).click();
		driver.findElement(By.xpath("(//div[@id='dismissible'])[11]")).click();
		Thread.sleep(2000);
		
	}

}
