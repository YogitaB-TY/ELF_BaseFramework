package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CanonCameraPage extends BasePage {

	public CanonCameraPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//button[@id='Buy Now']")
	private WebElement buyNowButton;

	/**
	 * @return the buyNowButton
	 */
	public WebElement getBuyNowButton() {
		return buyNowButton;
	}

	/**
	 * @param buyNowButton the buyNowButton to set
	 */
	public void setBuyNowButton(WebElement buyNowButton) {
		this.buyNowButton = buyNowButton;
	}
	

}
