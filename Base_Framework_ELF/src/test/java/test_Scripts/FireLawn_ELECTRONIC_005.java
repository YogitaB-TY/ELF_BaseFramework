package test_Scripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_scripts.ElectronicsPage;
import pom_scripts.Electronics_Camera_Page;
import pom_scripts.WelcomePage;

public class FireLawn_ELECTRONIC_005 extends Base_Test {
	@Test
	public void fireLawn_electronics_005() {
		WelcomePage welcome=new WelcomePage(driver);
		Electronics_Camera_Page camera=new Electronics_Camera_Page(driver);
		
		//Mouse hover on Electronics
		moveCursorToElement(welcome.getElectronicsLink());
		
		//Click on Electronics Gts store
		clickAction(welcome.getCamerasLink());
		
		//get the header of electronics page
		if(camera.getCameraPageHeading().getText().equalsIgnoreCase("Camera")) {
			test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		}
		else {
			test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}
	}
	

}
