package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AlwaysRun {
  @Test
  public void m1() 
  {
	  Assert.fail();
	  Reporter.log("m1 method",true);
  }
  
  @Test(dependsOnMethods = "m1",alwaysRun =true)
  public void m2()
  {
	  Reporter.log("m2 method",true);
  }
  
}
