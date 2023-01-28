package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/mubin/OneDrive/Desktop/multipledropdown.html");	
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		 Select sel = new Select (dropDownElement);
		 
		 
		 for(int i=3; i<5; i++)
		 {
			 sel.selectByIndex(i);
		 }
		 String option = sel.getFirstSelectedOption().getText();
		 
		 System.out.println(option);
	}

}
