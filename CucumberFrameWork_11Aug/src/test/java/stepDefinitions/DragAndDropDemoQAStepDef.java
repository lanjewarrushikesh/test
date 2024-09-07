package stepDefinitions;

import io.cucumber.java.en.When;
import pageActions.DragAndDropDemoQAPA;
import testRunnerLibrary.BaseClass;

public class DragAndDropDemoQAStepDef {
	
	DragAndDropDemoQAPA dragdrop = new DragAndDropDemoQAPA(BaseClass.getDriver());


	@When("^I drag and drop element on page$")
	public void idraganddropelementonpage() throws Throwable
	{
		dragdrop.dragAndDropElementOnDemoQA();
	}

}
