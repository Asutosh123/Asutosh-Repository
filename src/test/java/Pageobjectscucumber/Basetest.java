package Pageobjectscucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest {

	public static WebDriver driver;
	
	public static Properties prop;

	public Basetest(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
public void openBrowseR(String bType) {

	   
		
		

		if (bType.equals("Mozilla")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("gecko_exe"));
           driver = new FirefoxDriver();



		} else if (bType.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");

			ChromeOptions chromeOptions = new ChromeOptions();
			//chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
		//	logger.info("Sucessfully Launched  "+bType+ "Browser");

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

	}
	


public void initProp() {

	if (prop == null)
		prop = new Properties();
	try {
		FileInputStream fs = new FileInputStream( System.getProperty("user.dir") + "//src//test//resources//Properties//config.properties");
		prop.load(fs);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
/*	public void takeScreenShotFail(){
		// fileName of the screenshot
		Date d=new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
		// store screenshot in that file
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "//screenshots//FailedScreenshot//" + screenshotFile));
		} catch (IOException e) {
			// TODO Auto-generated catcsh block
			e.printStackTrace();
		}
		//put screenshot file in reports
		
		
	}
*/

	

}


	
}
