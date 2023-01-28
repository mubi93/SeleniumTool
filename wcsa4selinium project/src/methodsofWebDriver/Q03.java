package methodsofWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q03 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parenttitle = driver.getWindowHandle();
		
		System.out.println(parenttitle);
		System.out.println("------------------------------");
		Set<String> allhandles=driver.getWindowHandles();
		Thread.sleep(4000);
		
		
		for(String wh:allhandles)
		{
			System.out.println(wh);
			if(!parenttitle.equals(wh))
			{
				WebDriver cw=driver.switchTo().window(wh);
				cw.manage().window().maximize();
			}
			
		}
	}
}

