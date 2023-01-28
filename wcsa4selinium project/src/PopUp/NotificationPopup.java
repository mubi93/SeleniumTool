package PopUp;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("-start-maximized");
		//maximized the browser witout calling manage method
		
		co.addArguments("--disable-notification");
		
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("");
		
	}
	

}
