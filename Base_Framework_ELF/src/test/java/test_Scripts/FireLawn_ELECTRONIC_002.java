package test_Scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.LoginClass;
import pom_scripts.WelcomePage;

public class FireLawn_ELECTRONIC_002 extends LoginClass{
	@Test
	public void fireLawnElectronics_002() {
//		test=report.startTest("TestCase 2");
		WelcomePage welcome=new WelcomePage(driver);
		
		//Mouse over on electronics
		moveCursorToElement(welcome.getElectronicsLink());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Check if the electronics items are present
		for(WebElement electronics:welcome.getElectronicsItems()) {
			boolean isElementDisplayed=electronics.isDisplayed();
			assert1.assertEquals(isElementDisplayed, true);
			if(isElementDisplayed) {
				test.log(LogStatus.PASS, test.addScreenCapture(getElementPhoto(electronics)));
			}
			else {
				test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)),electronics.getText());
				
			}
		}
	}

}
