package test_Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Base_Test;

public class LoginTestCase extends Base_Test{
                            
	@Test
	public void tc() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.id("username")).sendKeys("yogita.b@testyantra.com");
		driver.findElement(By.id("password")).sendKeys("nopassword");
		driver.findElement(By.xpath("//span[text()='submit']")).click();
		Thread.sleep(8000);
		List<WebElement>icons=driver.findElements(By.cssSelector(".MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-vubbuv"));
		icons.get(0).click();
		/*actions_classObject(driver).moveToElement(driver.findElement(By.xpath("//a[text()='Electronic']"))).build().perform();
		actions_classObject(driver).moveToElement(driver.findElement(By.xpath("//a[text()='Headphones']"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='add to cart']")).click();
		explicitWait.until(ExpectedConditions.invisibilityOf
		(driver.findElement
		(By.xpath
	("//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"))));
		driver.findElement(By.xpath("//div[@class='navbar_authBlock2__oMeAw']//a")).click();*/
	}
}
