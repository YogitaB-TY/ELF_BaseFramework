package generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


/**
 * 
 * @author Yogita
 *
 */
public class UtilityMethods implements FrameworkConstants  {



	public static WebDriver driver;	

	public static String name() {
		LocalDateTime sysdate=LocalDateTime.now();
		String name=sysdate.toString().replace(":", "-");
		return name;
	}
	
	public void get_title() {
		String title= driver.getTitle();
		System.out.println(title);
	}

	public void get_url() {		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
	}

	public void clickAction(WebElement element_To_Click) {
		element_To_Click.click();
	}

	public void enter_value(WebElement TextField,String value) {		
		TextField.sendKeys(value);
	}

	public Select select_classObject(WebElement DropDown){		
		Select select= new Select(DropDown);		
		return select;		
	}

	public Actions actions_classObject(WebDriver driver) {		
		Actions action=new Actions(driver);
		return action;

	}
	public void switchToASpecificTitledWindow(String title) { 
		String parentWindowId = driver.getWindowHandle(); 

		Set<String> allWindowIds = driver.getWindowHandles(); allWindowIds.remove(parentWindowId); 
		for(String windowId:allWindowIds){ driver.switchTo().window(windowId);
		if(driver.getTitle().equalsIgnoreCase(title)){ 
			break; 
		} 
		} 
	} 
	public void switchToASpecificWindow(WebElement element) {

		String parent=driver.getWindowHandle(); 
		Set<String> allWid=driver.getWindowHandles(); 
		allWid.remove(parent); 
		for(String sessionID:allWid){ 
			driver.switchTo().window(sessionID);

			if(element.isDisplayed()){ 
				break; 
			} 
		} 
	}
	public static String getPhoto() {

		String imgPath=SCREENSHOT_PATH+name()+".png";
		TakesScreenshot takeScreenShot=(TakesScreenshot)driver;
		File source=takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destination= new File(imgPath);
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "."+imgPath;
	}
}
