package testNGpack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class SelectBrowser {
	WebDriver driver;
  @Test
  @Parameters("browser")
  public void openBrowser(String browserValue)
  {
	  if(browserValue.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  }
	  else
	  {
		  Reporter.log("enter Valid browser Value",true);
	  }
	  
	  
  }
}
