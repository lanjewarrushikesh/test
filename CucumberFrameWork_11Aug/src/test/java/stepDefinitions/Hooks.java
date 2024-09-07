package stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import commonUtilities.CommonActions;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testRunnerLibrary.BaseClass;

public class Hooks {
	
	CommonActions comnActionCls = new CommonActions(BaseClass.getDriver());
	
	@Before
	public void navigateToApp() throws Exception
	{
		comnActionCls.launchBrowserAndURL("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@After
	public void quitBrowser()
	{
		//comnActionCls.quitBrowser();
	}
	
	public static String returnCurrentTimeStamp()
	{
		SimpleDateFormat date = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		//20240812045856
		String timeStamp = date.format(new Date());
		String value1 = timeStamp.replaceAll(":", "");
	    String value2 = value1.replaceAll(" ", "");
	    System.out.println(value2);
		return value2;
	}
	
	@AfterStep
	public void takeScreenshotOfUI(Scenario scenario)
	{
	//if (scenario.isFailed()) {
		
		TakesScreenshot ts = (TakesScreenshot) BaseClass.getDriver();
		
		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src, "image/png", returnCurrentTimeStamp()+".png");
		//}
	}

}
