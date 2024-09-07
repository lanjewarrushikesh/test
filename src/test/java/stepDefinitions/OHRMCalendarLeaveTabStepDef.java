package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageActions.OHRMCalendarLeaveTabPA;
import testRunnerLibrary.BaseClass;

public class OHRMCalendarLeaveTabStepDef {
	
	OHRMCalendarLeaveTabPA clt = new OHRMCalendarLeaveTabPA(BaseClass.getDriver());
	
	@When("^I navigate to \"(.*)\" Tab$")
	public void inavigatetotab(String tabName) throws Throwable {
		clt.clickOnLeaveTab(tabName);
	}
	
	@And("^I click on element \"(.*)\"$")
	public void iclickonelement(String choice) throws Throwable {
		clt.clickDateInput(choice);
	}
	
	@And("^I select Month \"(.*)\"$")
	public void iselectmonth(String month) throws Throwable {
		clt.clickmonthDropDownSelector();
		clt.selectMonthValue(month);
	}
	
	@And("^I select Year \"(.*)\"$")
	public void iselectyear(String year) throws Throwable {
		clt.clickyearDropDownSelector();
		clt.selectYearValue(year);
	}
}
