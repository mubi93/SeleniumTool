package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeshort {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com");
		Thread.sleep(4000);
	    
		
		driver.findElement(By.xpath("(//div[@class='style-scope ytd-rich-shelf-renderer'])[17]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//div[@id='contents'])[10]"));
		
		
		
		
		
	}

}
