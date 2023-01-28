package methodsofWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q04 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parenttitle = driver.getTitle();
		
		Set<String> allHandle = driver.getWindowHandles();
		for(String wh:allHandle)
		{
			String currenttitle = driver.switchTo().window(wh).getTitle();
			System.out.println(currenttitle);
			if(!parenttitle.equals(wh))
			{
				driver.switchTo().window(wh).close();
				
			}
		}
	

	}
}
