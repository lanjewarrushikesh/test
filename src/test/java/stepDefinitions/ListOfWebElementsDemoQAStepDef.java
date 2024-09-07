package stepDefinitions;

import pageActions.ListOfWebElementsDemoQAPA;
import testRunnerLibrary.BaseClass;
import io.cucumber.java.en.Then;

public class ListOfWebElementsDemoQAStepDef {
	
	ListOfWebElementsDemoQAPA lpa = new ListOfWebElementsDemoQAPA(BaseClass.getDriver());
	
	@Then("^the total count of click me button is \"(.*)\"$")
	public void thetotalcountofclickmebuttonis(String count) throws Throwable
	{
		lpa.getCountOfClickMeButton(count);
	}
}
