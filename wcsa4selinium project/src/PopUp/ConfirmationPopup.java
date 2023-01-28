package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		driver.get("file:///C:/Users/mubin/OneDrive/Desktop/popup2.html");
		
		
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
		//al.accept();
		String textOfConfirm = al.getText();
		System.out.println(textOfConfirm);
		al.accept();
		
		
		

}
}
