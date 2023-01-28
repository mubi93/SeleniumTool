package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		//basic authentication popup
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String pagemessage = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(pagemessage);
		
		
	}

}
