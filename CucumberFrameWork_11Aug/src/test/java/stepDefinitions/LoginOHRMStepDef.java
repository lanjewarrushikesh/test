package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageActions.LogInOHRMPA;
import testRunnerLibrary.BaseClass;

public class LoginOHRMStepDef {
	
	LogInOHRMPA lpa = new LogInOHRMPA(BaseClass.getDriver());
	
	@Given("^I launch chrome \"(.*)\" with URL \"(.*)\"$")
	public void ilaunchchromebrowserwithurl(String choice, String url) throws Exception
	{
		lpa.launchBrowserAndURL(choice, url);
	}
	
	@When("^I enter username in username field as \"(.*)\"$")
	public void ienterusernameinusernamefieldas(String username) throws Throwable
	{
		lpa.enterUserName(username);
	}
	@And("^I enter password in password field as \"(.*)\"$")
	public void ienterpasswordinpasswordfieldas(String password) throws Throwable
	{
		lpa.enterPassword(password);
	}
	@And("^I click on login button$")
	public void iclickonloginbutton() throws Throwable
	{
		lpa.clickLoginButton();
	}
	

}
