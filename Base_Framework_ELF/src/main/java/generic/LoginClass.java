package generic;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class LoginClass extends Base_Test {
	
	@BeforeMethod
	public void loginTestCasse() {
			
			//test=report.startTest("Login");
			WelcomePage welcome=new WelcomePage(driver);
			LoginPage login=new LoginPage(driver);
			
			//Click on login button in welcome page
			clickAction(welcome.getLoginButton());
			test.log(LogStatus.INFO, "Clicked on Login link");
			
			//Enter email
			try {
				enter_value(login.getEmailTF(), getValueProperty("userName"));
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Enter password
			try {
				enter_value(login.getPwdTF(), getValueProperty("password"));
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Click on login button in Login page
			clickAction(login.getLoginButton());
			
//			report.endTest(test);
//			report.flush();
		}
		
	

}
