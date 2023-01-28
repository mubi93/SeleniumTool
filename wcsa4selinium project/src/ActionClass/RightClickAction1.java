package ActionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 
	 driver.get("file:///C:/Users/mubin/OneDrive/Desktop/Multiple.html");
	 
	 WebElement target = driver.findElement(By.id("menu"));
	 Actions act=new Actions(driver);
	 act.contextClick(target).perform();


}
}