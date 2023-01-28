package testNGpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class SelectBrowser {
	WebDriver driver;
   @Test
   @Parameters({"browservalue","url"})
  public void openBrowser(String browser,String url)
  {
	  if(browser.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromdriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
	  }
	  else if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
	  }
	  else
	  {
		  Reporter.log("enter valid browser value",true);
	  }
	  
  
  }
}
