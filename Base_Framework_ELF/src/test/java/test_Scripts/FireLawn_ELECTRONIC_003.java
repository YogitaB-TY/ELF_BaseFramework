package test_Scripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.LoginClass;
import pom_scripts.ElectronicsPage;
import pom_scripts.RegisterPage;
import pom_scripts.WelcomePage;

public class FireLawn_ELECTRONIC_003 extends LoginClass{
	
	@Test
	public void testCase3() {
		
		WelcomePage welcome=new WelcomePage(driver);
		ElectronicsPage electonics=new ElectronicsPage(driver);
		//Mouse hover on Electronics
		moveCursorToElement(welcome.getElectronicsLink());
		
		//Click on Electronics Gts store
		clickAction(welcome.getElectronicsGtsStore());
		
		//get the header of electronics page
		if(electonics.getElectronicsPageHeader().getText().equalsIgnoreCase("Electronics")) {
			test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		}
		else {
			test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}
		
	}

}
