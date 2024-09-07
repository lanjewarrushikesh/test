package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtilities.CommonActions;

public class DragAndDropDemoQAPO extends CommonActions{

	public DragAndDropDemoQAPO(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	protected By droppableBox = By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']");
	protected By draggableBox = By.xpath("//div[@id='draggable']");
	

}
