package test_Scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.LoginClass;
import generic.ReadExcel;
import pom_scripts.AddressFormPage;
import pom_scripts.AddressPage;
import pom_scripts.CanonCameraPage;
import pom_scripts.Electronics_Camera_Page;
import pom_scripts.WelcomePage;

public class FireLawn_ELECTRONIC_039 extends LoginClass {
	
	@DataProvider(name="Address")
	public String[][] readAddress() throws IOException{
		return ReadExcel.readExcelData("address");
	}

	@Test(dataProvider = "Address")
	public void fireLawn_electronics_039(String name,String house, String street, String landMark, String pinCode, String phoneNumber, String country, String state, String city) {
		WelcomePage welcome=new WelcomePage(driver);
		Electronics_Camera_Page camera=new Electronics_Camera_Page(driver);
		CanonCameraPage canonCamera=new CanonCameraPage(driver);
		AddressPage address=new AddressPage(driver);
		AddressFormPage form=new AddressFormPage(driver);
		
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
		
		//click on add address button
		clickAction(address.getAddNewAddressLink());
		
		//Select home address radio button
		clickAction(form.getHomeRadioButton());
		
		//Enter our name
		enter_value(form.getNameTF(), name);
		
		//Enter house or office info
		enter_value(form.getHomeOrOfficeTF(), house);
		
		//Enter street
		enter_value(form.getStreetInfoTF(), street);
		
		//Enter Landmark
		enter_value(form.getLandmarkTF(), landMark);
		
		//select country from country dropdown
		selectOptionByVisibleText(form.getCountryDropDown(), country);
		
		//Select State from state dropdown
		selectOptionByVisibleText(form.getStateDopDown(), state );
		
		//Select city from city dropdown
		selectOptionByVisibleText(form.getCityDropDown(), city);
		
		//Enter pin code
		enter_value(form.getPinCodeTF(), pinCode);
		
		//enter phone number
		enter_value(form.getPhoneNumberTF(), phoneNumber);
		
		//Click on the Add adress button
		clickAction(form.getAddAddressButton());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//validate wheather the address is added successfully or not
		if(address.getSuccessFullyAddedAlert().isDisplayed()) {
			Assert.assertEquals(address.getSuccessFullyAddedText().getText(), "successfully added");
			test.log(LogStatus.PASS, test.addScreenCapture(getElementPhoto(address.getSuccessFullyAddedAlert())));
		}
		else
		{
			test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}
		
		
	}
}
