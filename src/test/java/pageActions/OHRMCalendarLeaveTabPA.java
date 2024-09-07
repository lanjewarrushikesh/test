package pageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.OHRMCalendarLeaveTabPO;

public class OHRMCalendarLeaveTabPA extends OHRMCalendarLeaveTabPO {

	public OHRMCalendarLeaveTabPA(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	public void clickOnLeaveTab(String tabName) throws Throwable {
		clickElement(ohrmTabName(tabName));
	}
	
	public void clickDateInput(String choice) throws Throwable {
		clickElement(dateInputSelector(choice));
	}
	
	public void clickmonthDropDownSelector() throws Throwable {
		clickElement(monthDropDownSelector);
	}
	
	public void clickyearDropDownSelector() throws Throwable {
		clickElement(yearDropDownSelector);
	}
	
	public void selectMonthValue(String month) throws Throwable {
		clickElement(monthAndYearValue(month));
	}
	public void selectYearValue(String year) throws Throwable {
		clickElement(monthAndYearValue(year));
	}

}
