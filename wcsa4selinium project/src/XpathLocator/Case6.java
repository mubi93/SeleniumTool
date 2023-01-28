package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.domsnapshot.model.StringIndex;

import com.google.errorprone.annotations.FormatString;

import io.netty.util.AsciiString;

public class Case6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7038770883");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mubin7038770883");
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
				Thread.sleep(3000);
				driver.findElement(By.name("q")).sendKeys("samsung mobile");
				
				driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
				Thread.sleep(4000);
				
	}
				
				
				
	
}



