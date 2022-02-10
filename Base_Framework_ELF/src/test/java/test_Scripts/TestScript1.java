package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import generic.Base_Class;
import generic.Generic_Screenshots;
import generic.ReadExcel;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TestScript1 extends Base_Class{
	
	@Test(dataProvider = "testdata")
	public void testScript1(String email, String pwd) throws IOException {
		
		  WelcomePage Wp=new WelcomePage(driver); 
		  Wp.clickLogin();
		  LoginPage lp=new LoginPage(driver); 
		  lp.enterValueInEmail(email); 
		  lp.enterValueInPwd(pwd);
		  lp.clickLoginButton();
		  Generic_Screenshots.getPhoto(driver);
		 
	}
	
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet1");
		return testdata;
	}

}
