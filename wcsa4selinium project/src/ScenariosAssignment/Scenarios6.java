package ScenariosAssignment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scenarios6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("");
		
		
		
		
		
		
		
		
	}

}
