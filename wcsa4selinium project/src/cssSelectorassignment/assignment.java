package cssSelectorassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("mubin");
		driver.findElement(By.id("password")).sendKeys("mubin152@$123");
	    driver.findElement(By.cssSelector("button[class$='button']")).click();
		
		
		
		
		
}
}

	



