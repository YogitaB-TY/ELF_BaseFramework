package pom_scripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Electronics_Gst_Store_Page extends  BasePage {
	public Electronics_Gst_Store_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		//All products
		@FindBy(xpath="//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root featuredProducts_productCard__rpyS7 css-s18byi aos-init aos-animate']")
		private List<WebElement> allElectronicsProducts;
		
		@FindBy(xpath = "//h1[contains(text(),'about')]")
		private WebElement aboutHeading;

		/**
		 * @return the allElectronicsProducts
		 */
		public List<WebElement> getAllElectronicsProducts() {
			return  allElectronicsProducts;
		}

		/**
		 * @return the aboutHeading
		 */
		public WebElement getAboutHeading() {
			return aboutHeading;
		}

		/**
		 * @param aboutHeading the aboutHeading to set
		 */
		public void setAboutHeading(WebElement aboutHeading) {
			this.aboutHeading = aboutHeading;
		}

		/**
		 * @param allElectronicsProducts the allElectronicsProducts to set
		 */
		public void setAllElectronicsProducts(List<WebElement> allElectronicsProducts) {
			this.allElectronicsProducts = allElectronicsProducts;
		}

		


}
