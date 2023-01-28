package selectClass;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSetProgram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/mubin/OneDrive/Desktop/Multiple3.html");
		WebElement dropDown = driver.findElement(By.id("menu")); 
		
		Select sel=new Select (dropDown);
		HashSet<String> hs=new HashSet<String>();
		
		List<WebElement> allOptions=sel.getOptions();
		for(int i=0; i<allOptions.size(); i++)
		{
			
		  WebElement  opt =allOptions.get(i);
		  String value = opt.getText();
		  hs.add(value);
		}
		
		for(String opts:hs)
		{
			System.out.println(opts);
		}
		
	}
}
		


