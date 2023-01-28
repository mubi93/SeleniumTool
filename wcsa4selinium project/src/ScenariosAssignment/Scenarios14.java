package ScenariosAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class Scenarios14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Coins']")).click();
		//driver.findElement(By.xpath("//body[@class='page-front new-hp-ui with-white-header no-footer-top    p-auto-play   no-ticker']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
		
	

}
}