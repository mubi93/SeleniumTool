package methodsofWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02  {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		System.out.println("------------------------------");
		Set<String> handles=driver.getWindowHandles();
		Thread.sleep(4000);
		
		
		for(String wh:handles)
		{
			System.out.println(wh);
			if(!parentwindow.equals(wh))
			{
				driver.switchTo().window(wh).close();
			}
			else
			{
				
			}
			
		}
	
}

}
