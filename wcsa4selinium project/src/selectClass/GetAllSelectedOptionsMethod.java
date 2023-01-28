package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/mubin/OneDrive/Desktop/Multiple.html");	
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		 Select sel = new Select (dropDownElement);
		 for( int i=0; i<8; i++)
		 {
			 sel.selectByIndex(i);
		 }
		 List<WebElement> allOption = sel.getAllSelectedOptions();
		 for(WebElement opts:allOption)
		 {
			 String values = opts.getText();
		     System.out.println(values);
		 }
		 
	}

}
//o/p
//poha
//vadapav
//misal
//idli
//dosa

