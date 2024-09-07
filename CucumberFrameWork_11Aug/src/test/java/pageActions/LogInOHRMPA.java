package pageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.LogInOHRMPO;

public class LogInOHRMPA extends LogInOHRMPO {

	public LogInOHRMPA(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	public void enterUserName(String uname) throws Throwable
	{
		enterDataInElement(username, uname);
	}

	public void enterPassword(String pswd) throws Throwable
	{
		enterDataInElement(password, pswd);
	}
	
	public void clickLoginButton() throws Throwable
	{
		clickElement(loginButton);
	}
}
