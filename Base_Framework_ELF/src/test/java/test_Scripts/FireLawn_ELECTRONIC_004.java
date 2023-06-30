package test_Scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.LoginClass;
import pom_scripts.ElectronicsPage;
import pom_scripts.Electronics_Gst_Store_Page;
import pom_scripts.WelcomePage;

public class FireLawn_ELECTRONIC_004 extends LoginClass{
	
	@Test
	public void fireLawn_electronics_004() {
		WelcomePage welcome=new WelcomePage(driver);
		ElectronicsPage electonics=new ElectronicsPage(driver);
		Electronics_Gst_Store_Page gstStore=new Electronics_Gst_Store_Page(driver);
		
		//Mouse hover on Electronics
		moveCursorToElement(welcome.getElectronicsLink());
		
		//Click on Electronics Gts store
		clickAction(welcome.getElectronicsGtsStore());
		
		
		js.executeScript("arguments[0].scrollIntoView(true);",gstStore.getAboutHeading());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int size=gstStore.getAllElectronicsProducts().size();
		System.out.println(size);
		try {
			for(WebElement product:gstStore.getAllElectronicsProducts()) {
			    test.log(LogStatus.PASS, test.addScreenCapture( getElementPhoto(product)));	
				}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "No products in this web page");
		}
		
	}

}
