package test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.LoginClass;
import pom_scripts.AddressFormPage;
import pom_scripts.AddressPage;
import pom_scripts.CanonCameraPage;
import pom_scripts.Electronics_Camera_Page;
import pom_scripts.WelcomePage;

public class FireLawn_ELECTRONIC_042 extends LoginClass {
	
	@Test
	public void fireLawn_electronics_042() {
		WelcomePage welcome=new WelcomePage(driver);
		Electronics_Camera_Page camera=new Electronics_Camera_Page(driver);
		CanonCameraPage canonCamera=new CanonCameraPage(driver);
		AddressPage address=new AddressPage(driver);
		
		//Move cursor to electronics link
		moveCursorToElement(welcome.getElectronicsLink());
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click on cameras link
		clickAction(welcome.getCamerasLink());
		
		//click o canon camera product
		clickAction(camera.getCanonCameraImage());
		
		//click on buy now button
		clickAction(canonCamera.getBuyNowButton());
		
		//select any address
		clickAction(address.getAddressRadioButton());
		
		
		
     	//click on proceed button
	clickAction(address.getProceedButton());
		
		//js.executeScript("arguments[0].click();", address.getProceedButton());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Validate wheather the alert is displayed or not
		try {
			Assert.assertEquals(address.getInvalidAddressAlertText().getText(), "Please select address to be delivered. Order not deliverable at this pincode");
	        test.log(LogStatus.PASS, test.addScreenCapture(getElementPhoto(address.getInvalidAddressAlert())));
		}
		
		catch (Exception e) {
			
		
			test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}
		
	}

}
