
package generic;
/**
 * 
 * @author Yogita
 *
 */

public interface FrameworkConstants {
	
	
	String CHROME_KEY="webdriver.chrome.driver";	
	String CHROME_PATH="./src/main/resources/Drivers/chromedriver.exe";
	
	String FIREFOX_KEY="webdriver.gecko.driver";
	String FIREFOX_PATH="./src/main/resources/Drivers/geckodriver.exe";
	
	String EXCEL_PATH = "./src/test/resources/TestData/testData.xlsx";
	
	String PROPERTIES_PATH = "./src/test/resources/PropertyFile/data.properties";
	
	String SCREENSHOT_PATH = "./ScreenShots/";
	
	String REPORTS_PATH="./Reports/";
	
	String TEST_NAME="ExtentDemo";
	
	long TIMEOUTS_WAIT= 20;

}
