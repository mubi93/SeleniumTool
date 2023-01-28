package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//to avid that satale element exception
	@FindBy(name="username") private WebElement UsernameTB;
	@FindBy(name="pwd") private WebElement PasswordTB;
	@FindBy(id="loginButton") private WebElement LoginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement LoggedCheckBox;
	@FindBy(xpath="//a[.='keepLoggedInCheckBox']") private WebElement LicenseLink;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getUsernameTB() {
		return UsernameTB;
	}
	public WebElement getPasswordTB() {
		return PasswordTB;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	public WebElement getLoggedCheckBox() {
		return LoggedCheckBox;
	}
	
	public WebElement getLicenseLink() {
		return LicenseLink;
	}
	
	public void actiTimevalidLogin(String validUsername,String validPassword) throws InterruptedException
	{
		UsernameTB.sendKeys(validUsername);
		Thread.sleep(2000);
		PasswordTB.sendKeys(validPassword);
		Thread.sleep(2000);
		 LoginButton.click();
		
	}
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		UsernameTB.sendKeys(invalidUsername);
		Thread.sleep(2000);
		PasswordTB.sendKeys(invalidPassword);
		Thread.sleep(2000);
		 LoginButton.click();
		 Thread.sleep(1000);
		 UsernameTB.clear();
		
		
	}
	
	
}
	


