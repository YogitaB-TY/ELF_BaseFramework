package test_Scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.LoginClass;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class FireLawn_ELECTRONIC_001 extends LoginClass {
	
	
	
	@Test
	public void fireLawnElectronics_001() {
		
		WelcomePage welcome=new WelcomePage(driver);
		LoginPage login=new LoginPage(driver);
		
		
	boolean electronicsDisplayed=welcome.getElectronicsLink().isDisplayed();
	assert1.assertEquals(electronicsDisplayed, true);
	if(!electronicsDisplayed) {
		test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
	}
	else {
		test.log(LogStatus.PASS, test.addScreenCapture(getElementPhoto(welcome.getElectronicsLink())));
	}
	
	test.log(LogStatus.INFO, "Test Case completed");
		
	}
	
	
	
}
