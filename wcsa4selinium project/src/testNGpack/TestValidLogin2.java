package testNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestValidLogin2 {
	 static WebDriver driver;
	   @Test
	   @Parameters({"browser","url","usn","pass"})
	  public void method1(String browservalue,String url,String username,String password) throws InterruptedException
	  {
		  if(browservalue.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","./drivers/chromdriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get(url);
		  }
		  else if(browservalue.equals("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get(url);
			  
			  
			  driver.findElement(By.name("username")).sendKeys("admin");
			  Thread.sleep(2000);
			  driver.findElement(By.name("pwd")).sendKeys("manager");
			  Thread.sleep(2000);
			  driver.findElement(By.id("loginButton")).click();
		  }
		  else
		  {
			  Reporter.log("use correct browser !!",true);
		  }
		  
  }
}
