package testNGpack2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NoAnnotation {
	@Test
	public void test()
	{
		Reporter.log("Test Method",true );
	}
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("before Method",true);
  }

  @AfterMethod
  public void afterMethod() 
	  {
	  Reporter.log("AfterMethod",true);
  }
  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("before class",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("AfterClass",true);
	  
  }

  @BeforeTest
  public void beforeTest() 
	  {
	  Reporter.log("Before Test",true);
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("After Test",true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  
	  Reporter.log("Before Suite",true);
  }

  @AfterSuite
  public void afterSuite() 
	  {
	     Reporter.log("After Suite",true);
      }
  
}
