package generic;

import java.io.File;
 
import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

/**
 * 
 * @author Yogita
 *
 */

public class Generic_Screenshots extends Base_Test{
	
	public static String getPhoto(WebDriver driver) {
		
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
