package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtilities.CommonActions;

public class LogInOHRMPO extends CommonActions{

	public LogInOHRMPO(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	protected By username = By.name("username");
	protected By password = By.name("password");
	protected By loginButton = By.xpath("//button[@type='submit']");
}
