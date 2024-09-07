package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtilities.CommonActions;

public class ListOfWebElementsDemoQAPO extends CommonActions {

	public ListOfWebElementsDemoQAPO(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	protected By clickMeButtons = By.xpath("//Button[text()='Click me']");

}
