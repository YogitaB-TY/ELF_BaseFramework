package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "ico-login")
	WebElement Loginlink;
	
	public void clickLogin() {
		clickAction(Loginlink);
	}
	
	@FindBy(className = "ico-register")
	WebElement RegisterLink;
	
	public void clickRegister() {
		clickAction(RegisterLink);
	}

}
