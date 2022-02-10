package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import generic.PropertyFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Yogita
 *
 */

public class Base_Class implements FrameworkConstants{
	 
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void openApplication(@Optional("chrome")String browserName) throws Throwable {


		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			/*
			 * System.setProperty(CHROME_KEY,CHROME_PATH); driver=new ChromeDriver();
			 * Reporter.log("Successfully Launched Chrome Browser",true);
			 */
		}else if(browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			/*
			 * System.setProperty(FIREFOX_KEY,FIREFOX_PATH); driver=new FirefoxDriver();
			 * Reporter.log("Successfully Launched Firefox Browser",true);
			 */
		}else {
			Reporter.log("Enter valid Browser name");
		}

		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully",true);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		PropertyFileReader fileReader=new PropertyFileReader();
        String URL=fileReader.getValueProperty("URL");
		driver.get(URL);
	}

	@AfterClass(alwaysRun=true)
	public void CloseApp() {
		driver.quit();
	}


}
