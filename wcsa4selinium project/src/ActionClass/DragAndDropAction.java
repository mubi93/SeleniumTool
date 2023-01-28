package ActionClass;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://demoqa.com/droppable");
		 Thread.sleep(2000);
		 Actions act=new Actions(driver);
		 
		 WebElement Drag=driver.findElement(By.id("draggable"));
		 WebElement Drop=driver.findElement(By.id("droppable"));
		 Thread.sleep(2000);
		 act.dragAndDrop(Drag, Drop).perform();
		 
		 
		 
	}

}
