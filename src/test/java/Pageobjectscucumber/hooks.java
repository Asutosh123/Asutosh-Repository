package Pageobjectscucumber;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends Basetest {

	public hooks(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Before
	/**
	 * Delete all cookies at the start of each scenario to avoid shared state
	 * between tests
	 */
	public void openBrowser() throws Exception {
		initProp();
		openBrowseR("Chrome");
		
		

	}

	@After(order = 0)
	public void embedScreenshot(Scenario scenario) throws Exception {
	//	takeScreenShotFail();

		if (scenario.isFailed()) {
			try {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException wde) {
				System.err.println(wde.getMessage());
			} catch (ClassCastException cce) {
				
				cce.printStackTrace();
			}
		}
		driver.quit();
		
	}
	
	
	
}
