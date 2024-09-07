package pageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.ListOfWebElementsDemoQAPO;

public class ListOfWebElementsDemoQAPA extends ListOfWebElementsDemoQAPO{

	public ListOfWebElementsDemoQAPA(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	public void getCountOfClickMeButton(String count) throws Throwable
	{
		getListOfWebElementsWithTotalCount(clickMeButtons, count);
	}

}
