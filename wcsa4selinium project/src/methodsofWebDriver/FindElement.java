package methodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://integrator.actitime.com/auth/at");
		WebElement usernameTextbox=driver.findElement(By.name("username"));
		usernameTextbox.sendKeys("admin");
		System.out.println(usernameTextbox);
	}

}
