package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "loginBtn")
	private WebElement loginButton;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}

	/**
	 * @param loginButton the loginButton to set
	 */
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	/**
	 * @return the electronicsLink
	 */
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	/**
	 * @param electronicsLink the electronicsLink to set
	 */
	public void setElectronicsLink(WebElement electronicsLink) {
		this.electronicsLink = electronicsLink;
	}
	
	
	
	

}
