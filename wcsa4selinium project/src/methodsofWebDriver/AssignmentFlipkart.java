package methodsofWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("i phone 14 pro");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 Pro (Space Black, 128 GB)']")).click();
		Thread.sleep(2000);
		
		String parenttitle = driver.getWindowHandle();
		
		System.out.println(parenttitle);
		System.out.println("------------------------------");
		Set<String> han = driver.getWindowHandles();
		for(String win:han)
		{
		    System.out.println(win);
		    if(!parenttitle.equals(han))
		    {
		    	WebDriver cw = driver.switchTo().window(parenttitle);
		    	cw.manage().window().maximize();
		    }
			driver.switchTo().window(win);
		}
        driver.findElement(By.xpath("//a[.='256 GB']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        driver.close();
        
       
	}

}
