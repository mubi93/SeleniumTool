package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 
{
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutlink;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeButton;
	@FindBy(xpath="//div[.='Users']") private WebElement users;
	@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropDown;
	
	//initilization
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getLogoutlink()
	{
		return logoutlink;
	}
	public WebElement getSaveLeaveTimeButton()
	{
		return saveLeaveTimeButton;
	}

	public WebElement getuser()
	{
		return users;
	}

	public WebElement getEnterTimeTrackDropDown()
	{
		return enterTimeTrackDropDown;
	}

	
	
	public void logout()
	{
		logoutlink.click();
	}
	
	public void clikonusers()
	{
		users.click();
	}
	public void clickonsaveleavetime()
	{
		saveLeaveTimeButton.click();
	}
	public void selectuser(int index)
	{
		Select sel=new Select(enterTimeTrackDropDown);
		sel.selectByIndex(index);
	}
	
	}
	