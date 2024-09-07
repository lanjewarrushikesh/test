package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtilities.CommonActions;

public class OHRMCalendarLeaveTabPO extends CommonActions {

	public OHRMCalendarLeaveTabPO(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	protected By ohrmTabName(String choice) {
		return By.xpath("//a[contains(@href,'"+choice+"')]");
	}
	
	protected By dateInputSelector(String choice) {
		return By.xpath("//label[text()='"+choice+"']//parent::div//following-sibling::div//input[@placeholder='yyyy-dd-mm']");
	}
	
	protected By monthDropDownSelector = By.xpath("//li[@class='oxd-calendar-selector-month']");
	
	protected By yearDropDownSelector = By.xpath("//li[@class='oxd-calendar-selector-year']");
	
	protected By monthAndYearValue(String choice) {
		return By.xpath("//li[@class='oxd-calendar-dropdown--option' and text()='"+choice+"']");
	}
	
}
