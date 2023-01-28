package testNGpack;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
	 @Test
	  public void sumo()
	  {
		  System.out.println("this is method of demo class!");
		  Reporter.log("this is Method of Demo Class !!",true);
		  
		  
		  
	  }
	  @Test
	  public void sumo1()
	  {
		  Reporter.log("this is demo1 method !!",true);
	  }
	  @Test
	  public void sumo2()
	  {
		  int a=10;
		  int b=4;
		  int res=a/b;
		  
		  Reporter.log("this is demo2 method!!",true);
	  }
	}

