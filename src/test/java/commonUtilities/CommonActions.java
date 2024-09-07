package commonUtilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;



public class CommonActions extends CommonMethods {

	public CommonActions(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}

	public void launchBrowserAndURL(String choice, String URL) throws Exception {

		if (choice.equalsIgnoreCase("chrome")) {
			// ExtentCucumberAdapter.addTestStepLog("browser used is chrome");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
		} else if (choice.equalsIgnoreCase("edge")) {
			// ExtentCucumberAdapter.addTestStepLog("browser used is edge");
			EdgeOptions options = new EdgeOptions();
			options.addArguments("start-maximized");
			driver = new EdgeDriver(options);
		}

		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void scrollTillElement(By reference) throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		element = createUiElement(reference);
		;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void clickElement(By reference) throws Throwable {
		
		element = createUiElement(reference);
		if(!isDisplayed()) 
		{
			scrollTillElement(reference);
			click();
			Thread.sleep(1000);
		}
		else 
		{
			click();
			Thread.sleep(1000);
		}
		
	}
	
	public void enterDataInElement(By reference, CharSequence... data) throws Throwable {
		scrollTillElement(reference);
		element = createUiElement(reference);
		super.sendKeys(data);
		Thread.sleep(1000);
	}
	
	public boolean checkIfElementDisplayed(By reference) throws Throwable {

		element = createUiElement(reference);
		boolean val = false;

		try {

			if (super.isDisplayed()) {
				val = true;
			} else {
				val = false;
			}
		} catch (Exception e) {
			System.out.println("Element is not displayed");
		}
		return val;
	}
	
	public String getTextOfElement(By reference) throws Throwable {
		element = createUiElement(reference);
		return super.getText();
	}
	
	public void getListOfWebElementsWithTotalCount(By reference, String size) throws Throwable
	{
		multipleElements = createUiElements(reference);
		ExtentCucumberAdapter.addTestStepLog("Count of Click me buttons"+ multipleElements.size());
		int expectedSize = Integer.parseInt(size);
		Assert.assertEquals(expectedSize, multipleElements.size());
	}

	public void uploadFileOnUI(String filenamewithpath) throws Exception {
		Robot rb = new Robot();

		StringSelection str = new StringSelection(filenamewithpath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

	public void handleWindowAndGetChildWindow(By reference, String childwindowHeading) throws Throwable {
		// Get handles of the windows
		String mainWindowHandle = super.getWindowHandle();
		Set<String> allWindowHandles = super.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		// Here we will check if child window has other child windows and will fetch the
		// heading of the child window
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				super.switchTo().window(ChildWindow);
				System.out.println("Heading of child window is " + getTextOfElement(reference));
				Assert.assertEquals(childwindowHeading, getTextOfElement(reference));
			}
		}
	}

	public void compareTextValueOfElementWithValueOnUI(By reference, String expectedValue) throws Throwable {
		Assert.assertEquals(expectedValue, getTextOfElement(reference));
	}

	public boolean checkIfElementDisplayedOnUI(By reference) throws Throwable {
		boolean output = checkIfElementDisplayed(reference);
		// Assert.assertEquals(true, checkIfElementDisplayed(reference));
		return output;
	}

	public boolean checkIfElementnotDisplayedOnUI(By reference) throws Throwable {
		boolean output = checkIfElementDisplayed(reference);
		// Assert.assertEquals(false, checkIfElementDisplayed(reference));
		return output;
	}

	public void switchToFrame(By reference) throws Throwable {
		element = createUiElement(reference);
		super.switchTo().frame(element);
	}

	public void switchOutOfFrame() {
		super.switchTo().defaultContent();
	}

	public void dragAndDropElement(By dragReference, By dropReference) throws Throwable {
		actions = new Actions(getDriver());
		dragelement = createUiElement(dragReference);
		dropelement = createUiElement(dropReference);
		scrollTillElement(dragReference);
		actions.dragAndDrop(dragelement, dropelement).build().perform();
		Thread.sleep(2000);

	}

	public void acceptAlert() {
		super.switchTo().alert();
		super.accept();

	}

	public void dismissAlert() {
		super.switchTo().alert();
		super.dismiss();
	}

	public void enterDataInAlertAndAccept(String data) {
		super.switchTo().alert();
		super.sendKeys(data);
		super.accept();
	}

	public void enterDataInAlertAndDismiss(String data) {
		super.switchTo().alert();
		super.sendKeys(data);
		super.dismiss();
	}

	public void selectDropDownValueUsing(By reference, String choice, int index, String value, String visibleText)
			throws Throwable {
		element = createUiElement(reference);
		;
		select = new Select(element);

		switch (choice) {
		case "index": {
			select.selectByIndex(index);
		}
			break;
		case "value": {
			select.selectByValue(value);
		}
			break;
		case "visibletext": {
			select.selectByVisibleText(visibleText);
		}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

	

	public boolean checkIfElementChecked(By reference) throws Throwable {

		element = createUiElement(reference);
		boolean val = false;

		try {

			if (super.isSelected()) {
				val = true;
			} else {
				val = false;
			}
		} catch (Exception e) {
			System.out.println("Element is not selected");
		}
		return val;
	}

}
