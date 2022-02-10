package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class WelcomePage extends UtilityMethods{
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
