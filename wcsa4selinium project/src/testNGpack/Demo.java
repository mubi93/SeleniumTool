package testNGpack;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void Demo()
  {
	  System.out.println("this is method of demo class!");
	  Reporter.log("this is Method of Demo Class !!",true);
	  
  }
  @Test
  public void demo1()
  {
	  Reporter.log("this is demo1 method !!",true);
  }
  @Test
  public void demo2()
  {
	  int a=10;
	  int b=0;
	  int res=a/b;
	  
	  Reporter.log("this is demo2 method!!",true);
  }
}
