package PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class ActiTimeValidLogin 
{

	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	BaseTest bt=new BaseTest();
        bt.openBrowser();
	 
	
	Flib flib=new Flib();
	
	
	
	LoginPage lp = new LoginPage(driver);
	lp.actiTimevalidLogin(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH,"Password"));
		

}
}
