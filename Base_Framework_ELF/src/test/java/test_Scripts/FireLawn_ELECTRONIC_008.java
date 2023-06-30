package test_Scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.LoginClass;

import pom_scripts.ElectronicsPage;
import pom_scripts.Electronics_Camera_Page;
import pom_scripts.WelcomePage;

public class FireLawn_ELECTRONIC_008 extends LoginClass{
	
	@Test
	public void fireLawn_electronics_008() {
		WelcomePage welcome=new WelcomePage(driver);
		ElectronicsPage electonics=new ElectronicsPage(driver);
		Electronics_Camera_Page camera=new Electronics_Camera_Page(driver);
		
		//Mouse hover on Electronics
		moveCursorToElement(welcome.getElectronicsLink());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on Electronics Gts store
		clickAction(welcome.getCamerasLink());
		
		/*
		 * Scroll till the end
		 */
		//js.executeScript("arguments[0].scrollIntoView(true);",camera.getAboutHeading());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int size=camera.getAllCameraProducts().size();
		System.out.println(size);
		
		if(size>0) {
			for(WebElement rating:camera.getReviewRatingOfAllProducts()) {
				if(rating.isDisplayed()) {
			    test.log(LogStatus.PASS, test.addScreenCapture( getElementPhoto(rating)));	
				}
				else {
					for(WebElement product:camera.getAllCameraProducts()) {
					    test.log(LogStatus.PASS, test.addScreenCapture( getElementPhoto(product)));	
					
					}
				}
			
			}
		}
			else {
				
			test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}
	}

}
