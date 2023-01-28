package ActionClass;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {public static void main(String[] args) throws InterruptedException, AWTException {
	
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 driver.get("https://demoqa.com/buttons");
	 
	 Thread.sleep(4000);
	 Actions act=new Actions(driver);
	 WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
	 act.doubleClick(doubleClick).perform();
	 Thread.sleep(4000);
	 
	 

}
}