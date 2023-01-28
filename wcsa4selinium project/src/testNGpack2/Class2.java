package testNGpack2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
  

	static WebDriver driver;
    @Test(enabled = false)
    public void sql() 
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://www.google.com");
	  driver.switchTo().activeElement().sendKeys("manual testing");
	  
	  
   }
}
  
