
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Idassignment3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("number")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		driver.findElement( By.className(("sc-cCbXAZ dpOxSa"))).click();
		
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.close();
	}
}




