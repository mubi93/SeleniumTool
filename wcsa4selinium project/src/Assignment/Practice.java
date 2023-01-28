package Assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./C://Users/mubin/Downloads/chromedriver_win32.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		
		driver.get("https://chromedriver.chromium.org/downloads");
	}

}
