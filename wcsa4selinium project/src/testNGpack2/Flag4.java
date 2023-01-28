package testNGpack2;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;

public class Flag4 {
	@Test
	public void loginmethod()
	{
		Reporter.log("login is done",true);
	}
	@Test(dependsOnMethods = "loginMethod")
	public void CreateUser()
	{
		Reporter.log("User is Created",true);
	}
	@Test(dependsOnMethods = "create user")
	public void logoutMethod()
	{
		Reporter.log("logout is done",true);
	}
	
	
}
