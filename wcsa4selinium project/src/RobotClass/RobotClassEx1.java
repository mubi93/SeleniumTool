package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RobotClassEx1 {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.selenium.dev/downloads/");
		WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Actions act=new Actions(driver);
		
		act.contextClick(target).perform();
		
		Robot robot=new Robot();
		
		for(int i=0; i<10; i++)
		{
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
		
				
		
	
		
	}


