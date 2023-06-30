package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage{

	public AddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[@class='selectaddress_adneadd__kZf+o']")
	private WebElement addNewAddressLink;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedButton;

	//Address added successfully alert text
	@FindBy(xpath = "//div[text()='successfully added']")
	private WebElement successFullyAddedText;
	
	//Address added successfully alert box
	@FindBy(xpath = "//div[text()='successfully added']/../..")
	private WebElement successFullyAddedAlert;
	
	//Address radio button
	@FindBy(xpath = "//input[@id='18036']")
	private WebElement addressRadioButton;
	
	//Invalid address Alert text
	@FindBy(xpath = "//div[@id='root']//div[@role='alert']/div[2]")
	private WebElement invalidAddressAlertText;
	
	//Invalid address alert box
	@FindBy(xpath = "//div[@id='root']//div[@role='alert']")
	private WebElement invalidAddressAlert;
	
	
	/**
	 * @return the addressRadioButton
	 */
	public WebElement getAddressRadioButton() {
		return addressRadioButton;
	}

	/**
	 * @param addressRadioButton the addressRadioButton to set
	 */
	public void setAddressRadioButton(WebElement addressRadioButton) {
		this.addressRadioButton = addressRadioButton;
	}

	/**
	 * @return the invalidAddressAlertText
	 */
	public WebElement getInvalidAddressAlertText() {
		return invalidAddressAlertText;
	}

	/**
	 * @param invalidAddressAlertText the invalidAddressAlertText to set
	 */
	public void setInvalidAddressAlertText(WebElement invalidAddressAlertText) {
		this.invalidAddressAlertText = invalidAddressAlertText;
	}

	/**
	 * @return the invalidAddressAlert
	 */
	public WebElement getInvalidAddressAlert() {
		return invalidAddressAlert;
	}

	/**
	 * @param invalidAddressAlert the invalidAddressAlert to set
	 */
	public void setInvalidAddressAlert(WebElement invalidAddressAlert) {
		this.invalidAddressAlert = invalidAddressAlert;
	}

	/**
	 * @return the successFullyAddedText
	 */
	public WebElement getSuccessFullyAddedText() {
		return successFullyAddedText;
	}

	/**
	 * @param successFullyAddedText the successFullyAddedText to set
	 */
	public void setSuccessFullyAddedText(WebElement successFullyAddedText) {
		this.successFullyAddedText = successFullyAddedText;
	}

	/**
	 * @return the successFullyAddedAlert
	 */
	public WebElement getSuccessFullyAddedAlert() {
		return successFullyAddedAlert;
	}

	/**
	 * @param successFullyAddedAlert the successFullyAddedAlert to set
	 */
	public void setSuccessFullyAddedAlert(WebElement successFullyAddedAlert) {
		this.successFullyAddedAlert = successFullyAddedAlert;
	}

	/**
	 * @return the proceedButton
	 */
	public WebElement getProceedButton() {
		return proceedButton;
	}

	/**
	 * @param proceedButton the proceedButton to set
	 */
	public void setProceedButton(WebElement proceedButton) {
		this.proceedButton = proceedButton;
	}

	/**
	 * @return the addNewAddressLink
	 */
	public WebElement getAddNewAddressLink() {
		return addNewAddressLink;
	}

	/**
	 * @param addNewAddressLink the addNewAddressLink to set
	 */
	public void setAddNewAddressLink(WebElement addNewAddressLink) {
		this.addNewAddressLink = addNewAddressLink;
	}
	
	
}
