package commonUtilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testRunnerLibrary.BaseClass;

public abstract class UiElement extends BaseClass implements WebElement {

	public UiElement(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	public static WebElement createUiElement(By reference) {
		
		return getDriver().findElement(reference);
	}
	
	public static List<WebElement> createUiElements(By reference) {
		
		return getDriver().findElements(reference);
	}

}
