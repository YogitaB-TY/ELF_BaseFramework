package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class BasePage extends UtilityMethods {
	/**
	 * 
	 * @param driver
	 * @author Yogita
	 * 
	 */

	public BasePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
