package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotEx1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chromedriver.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest =new File("./screenShots/mubin.jpg");
		Files.copy(src, dest);
	}

}

