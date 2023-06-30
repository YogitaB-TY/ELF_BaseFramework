package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage{
	
	public ElectronicsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[@class='breadCrumb_breadCrumb__tMWHL']//a[@class='active']//..//a")
	private WebElement ElectronicsPageHeader;
	
	@FindBy(xpath = "//a[text()='Cameras ']")
	private WebElement camerasLink;
	/**
	 * @return the electronicsPageHeader
	 */
	public WebElement getElectronicsPageHeader() {
		return ElectronicsPageHeader;
	}

	/**
	 * @return the camerasLink
	 */
	public WebElement getCamerasLink() {
		return camerasLink;
	}

	/**
	 * @param camerasLink the camerasLink to set
	 */
	public void setCamerasLink(WebElement camerasLink) {
		this.camerasLink = camerasLink;
	}

	/**
	 * @param electronicsPageHeader the electronicsPageHeader to set
	 */
	public void setElectronicsPageHeader(WebElement electronicsPageHeader) {
		ElectronicsPageHeader = electronicsPageHeader;
	}
	

}
