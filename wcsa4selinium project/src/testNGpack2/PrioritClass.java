package testNGpack2;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrioritClass {
	@Test (priority =3)
	public void z()
	{
		Reporter.log("z",true);
	}
	@Test (priority =1)
	public void h()
	{
		Reporter.log("h",true);
	}
	@Test (priority =7)
	public void m()
	{
		Reporter.log("m",true);
	}
	@Test (priority =0)
	public void b()
	{
		Reporter.log("b",true);
	}
	@Test (priority =0)
	public void a()
	{
		Reporter.log("a",true);
	}
	@Test (priority =0)
	public void k()
	{
		Reporter.log("k",true);
	}
	@Test (priority =-1)
	public void i()
	{
		Reporter.log("i",true);
	}
}

// Z=3   h=1  k=nopriority m=7
    // b=no priority A=0 priority b=2 

// if priority will be same that time priority will be display alphabhetical manner
//if the priority is negative it will execute first
