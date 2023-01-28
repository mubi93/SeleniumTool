package ScenariosAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenarios16 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();
		

		 WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));
		 Actions act=new Actions(driver);
		 act.contextClick(target).perform();



}
}