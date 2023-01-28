package ScenariosAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Scenarios2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		driver.get("https://www.ebay.com/");
		//input[@class='gh-tb ui-autocomplete-input']
		WebElement searchtextbox = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		searchtextbox.click();
		searchtextbox.sendKeys("Apple");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		Select sel=new Select(dropdown);
		sel.selectByValue("550");
		
		driver.findElement(By.id("gh-btn")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenShots/screenshot2.jpg");
		Files.copy(src,des);
		
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//span[.='JOHN FOULGER 1942-2007 STILL LIFE APPLES & BREAD SIGNED ANTIQUE Oil Painting']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File des1=new File("./screenShots/screenshot3.jpg");
		Files.copy(src1, des1);
		
		
	}

}
