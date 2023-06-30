package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class AddressFormPage extends BasePage {

	
	public AddressFormPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Home radio button
	@FindBy(xpath = "//input[@id='Home']")
	private WebElement homeRadioButton;

	//Name text field button
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement nameTF;

	//House/Office Info
	//House/ office text field
	@FindBy(xpath = "//input[@id='House/Office Info']")
	private WebElement homeOrOfficeTF;

	//Street info field 
	@FindBy(xpath = "//input[@id='Street Info']")
	private WebElement streetInfoTF;

	//Landmark text  field 
	@FindBy(xpath = "//input[@id='Landmark']")
	private WebElement landmarkTF;

	//country drop down
	@FindBy(xpath = "//select[@id='Country']")
	private WebElement countryDropDown;


	//State drop down
	@FindBy(xpath = "//select[@id='State']")
	private WebElement stateDopDown;

	//City drop down
	@FindBy(xpath = "//select[@id='City']")
	private WebElement cityDropDown;

	//Pin code text  field 
	@FindBy(xpath = "//input[@id='Pincode']")
	private WebElement pinCodeTF;


	//Phone number text  field 
	@FindBy(xpath = "//input[@id='Phone Number']")
	private WebElement phoneNumberTF;

	//Landmark text  field 
	@FindBy(xpath = "//button[@id='addAddress']")
	private WebElement addAddressButton;

	/**
	 * @return the homeRadioButton
	 */
	public WebElement getHomeRadioButton() {
		return homeRadioButton;
	}

	/**
	 * @param homeRadioButton the homeRadioButton to set
	 */
	public void setHomeRadioButton(WebElement homeRadioButton) {
		this.homeRadioButton = homeRadioButton;
	}

	/**
	 * @return the nameTF
	 */
	public WebElement getNameTF() {
		return nameTF;
	}

	/**
	 * @param nameTF the nameTF to set
	 */
	public void setNameTF(WebElement nameTF) {
		this.nameTF = nameTF;
	}

	/**
	 * @return the homeOrOfficeTF
	 */
	public WebElement getHomeOrOfficeTF() {
		return homeOrOfficeTF;
	}

	/**
	 * @param homeOrOfficeTF the homeOrOfficeTF to set
	 */
	public void setHomeOrOfficeTF(WebElement homeOrOfficeTF) {
		this.homeOrOfficeTF = homeOrOfficeTF;
	}

	/**
	 * @return the streetInfoTF
	 */
	public WebElement getStreetInfoTF() {
		return streetInfoTF;
	}

	/**
	 * @param streetInfoTF the streetInfoTF to set
	 */
	public void setStreetInfoTF(WebElement streetInfoTF) {
		this.streetInfoTF = streetInfoTF;
	}

	/**
	 * @return the landmarkTF
	 */
	public WebElement getLandmarkTF() {
		return landmarkTF;
	}

	/**
	 * @param landmarkTF the landmarkTF to set
	 */
	public void setLandmarkTF(WebElement landmarkTF) {
		this.landmarkTF = landmarkTF;
	}

	/**
	 * @return the countryDropDown
	 */
	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	/**
	 * @param countryDropDown the countryDropDown to set
	 */
	public void setCountryDropDown(WebElement countryDropDown) {
		this.countryDropDown = countryDropDown;
	}

	/**
	 * @return the stateDopDown
	 */
	public WebElement getStateDopDown() {
		return stateDopDown;
	}

	/**
	 * @param stateDopDown the stateDopDown to set
	 */
	public void setStateDopDown(WebElement stateDopDown) {
		this.stateDopDown = stateDopDown;
	}

	/**
	 * @return the cityDropDown
	 */
	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	/**
	 * @param cityDropDown the cityDropDown to set
	 */
	public void setCityDropDown(WebElement cityDropDown) {
		this.cityDropDown = cityDropDown;
	}

	/**
	 * @return the pinCodeTF
	 */
	public WebElement getPinCodeTF() {
		return pinCodeTF;
	}

	/**
	 * @param pinCodeTF the pinCodeTF to set
	 */
	public void setPinCodeTF(WebElement pinCodeTF) {
		this.pinCodeTF = pinCodeTF;
	}

	/**
	 * @return the phoneNumberTF
	 */
	public WebElement getPhoneNumberTF() {
		return phoneNumberTF;
	}

	/**
	 * @param phoneNumberTF the phoneNumberTF to set
	 */
	public void setPhoneNumberTF(WebElement phoneNumberTF) {
		this.phoneNumberTF = phoneNumberTF;
	}

	/**
	 * @return the addAddressButton
	 */
	public WebElement getAddAddressButton() {
		return addAddressButton;
	}

	/**
	 * @param addAddressButton the addAddressButton to set
	 */
	public void setAddAddressButton(WebElement addAddressButton) {
		this.addAddressButton = addAddressButton;
	}
	
	
	

}
