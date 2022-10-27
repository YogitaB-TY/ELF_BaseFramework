package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		super(driver);
	}
	
	@FindBy(className  ="email")
	WebElement emailTF;
	
	public void enterValueInEmail(String email) {
		
		enter_value(emailTF, email);
	}
	
	@FindBy(className = "password")
	WebElement pwdTF;
	public void enterValueInPwd(String pwd) {
		enter_value(pwdTF, pwd);
		
	}
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement LoginButton;
	public void clickLoginButton() {
		clickAction(LoginButton);
	}

}
