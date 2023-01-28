package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {
	public static void main(String[] args) {
		
	 //System.setProperty("webdriver.chrome.driver","./drivers/chromdriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 
	 
	 
	 driver.get("file:///C:/Users/mubin/OneDrive/Desktop/multipledropdown.html");
	 WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='menu']"));
	 
	 Select sel=new Select(dropDownElement);
	 boolean status =sel.isMultiple();
	 System.out.println(status);
}


}




