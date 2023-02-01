package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Yogita
 * 
 *
 */

public class Base_Test extends UtilityMethods{
	
	
	@BeforeSuite
	public void beforeSuit(){
		report=new ExtentReports(REPORTS_PATH+name()+".html");
		test=report.startTest(TEST_NAME);
	}
	
	
	
	@BeforeClass(alwaysRun=true)
	public void browserSetup() throws Throwable {


		browserName= getValueProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			test.log(LogStatus.INFO, "Browser is launched");
			/*
			 * System.setProperty(CHROME_KEY,CHROME_PATH); driver=new ChromeDriver();
			 * Reporter.log("Successfully Launched Chrome Browser",true);
			 */
		}else if(browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			test.log(LogStatus.INFO, "Browser is launched");
			/*
			 * System.setProperty(FIREFOX_KEY,FIREFOX_PATH); driver=new FirefoxDriver();
			 * Reporter.log("Successfully Launched Firefox Browser",true);
			 */
		}else {
			Reporter.log("Enter valid Browser name");
		}

		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully",true);
		test.log(LogStatus.INFO, "Browser window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(TIMEOUTS_WAIT,TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, TIMEOUTS_WAIT);
		
        URL=getValueProperty("URL");
        test.log(LogStatus.INFO, "WebPage is displayed successfully");
		driver.get(URL);
		initObjects();
	}

	@AfterClass(alwaysRun=true)
	public void CloseApp() {
		driver.quit();
		test.log(LogStatus.INFO, "End Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		report.endTest(test);
		report.flush();
	}
	
	


}
