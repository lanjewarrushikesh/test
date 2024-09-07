package pageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.DragAndDropDemoQAPO;

public class DragAndDropDemoQAPA extends DragAndDropDemoQAPO{

	public DragAndDropDemoQAPA(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	public void dragAndDropElementOnDemoQA() throws Throwable 
	{
		dragAndDropElement(draggableBox, droppableBox);
	}
}
