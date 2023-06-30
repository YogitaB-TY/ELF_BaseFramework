package pom_scripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Electronics_Camera_Page extends BasePage {
	public Electronics_Camera_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	@FindBy(xpath = "(//div[@class='breadCrumb_breadCrumb__tMWHL']//li/a)[2]")
	private WebElement cameraPageHeading;
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root featuredProducts_productCard__rpyS7 css-s18byi aos-init aos-animate']")
	private List<WebElement> allCameraProducts;
	
	@FindBy(xpath = "//h1[contains(text(),'about')]")
	private WebElement aboutHeading;
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root featuredProducts_productCard__rpyS7 css-s18byi aos-init aos-animate']//img")
	private List<WebElement> allCameraImages;

	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root featuredProducts_productCard__rpyS7 css-s18byi aos-init aos-animate']//div[@class='featuredProducts_cardHeader__v5AIX']")
	private List<WebElement> reviewRatingOfAllProducts;
	
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root featuredProducts_productCard__rpyS7 css-s18byi aos-init aos-animate']//div[@class='featuredProducts_footerLeft__iP3CQ']/span[1]")
	private List<WebElement> brandNameOfAllProducts; 
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root featuredProducts_productCard__rpyS7 css-s18byi aos-init aos-animate']//div[@class='featuredProducts_footerLeft__iP3CQ']/span[2]")
	private List<WebElement> modelNameOfAllProducts; 

	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root featuredProducts_productCard__rpyS7 css-s18byi aos-init aos-animate']//div[@class='featuredProducts_footerLeft__iP3CQ']//p/span[1]")
	private List<WebElement> actualPriceOfAllProduct; 

	@FindBy(xpath = "//span[text()='canon']/../../..//img")
	private WebElement canonCameraImage;
	
	
	
	
	/**
	 * @return the canonCameraImage
	 */
	public WebElement getCanonCameraImage() {
		return canonCameraImage;
	}

	/**
	 * @param canonCameraImage the canonCameraImage to set
	 */
	public void setCanonCameraImage(WebElement canonCameraImage) {
		this.canonCameraImage = canonCameraImage;
	}

	/**
	 * @return the actualPriceOfAllProduct
	 */
	public List<WebElement> getActualPriceOfAllProduct() {
		return actualPriceOfAllProduct;
	}

	/**
	 * @param actualPriceOfAllProduct the actualPriceOfAllProduct to set
	 */
	public void setActualPriceOfAllProduct(List<WebElement> actualPriceOfAllProduct) {
		this.actualPriceOfAllProduct = actualPriceOfAllProduct;
	}

	/**
	 * @return the modelNameOfAllProducts
	 */
	public List<WebElement> getModelNameOfAllProducts() {
		return modelNameOfAllProducts;
	}

	/**
	 * @param modelNameOfAllProducts the modelNameOfAllProducts to set
	 */
	public void setModelNameOfAllProducts(List<WebElement> modelNameOfAllProducts) {
		this.modelNameOfAllProducts = modelNameOfAllProducts;
	}

	/**
	 * @return the brandNameOfAllProducts
	 */
	public List<WebElement> getBrandNameOfAllProducts() {
		return brandNameOfAllProducts;
	}

	/**
	 * @param brandNameOfAllProducts the brandNameOfAllProducts to set
	 */
	public void setBrandNameOfAllProducts(List<WebElement> brandNameOfAllProducts) {
		this.brandNameOfAllProducts = brandNameOfAllProducts;
	}

	/**
	 * @return the reviewRatingOfAllProducts
	 */
	public List<WebElement> getReviewRatingOfAllProducts() {
		return reviewRatingOfAllProducts;
	}

	/**
	 * @param reviewRatingOfAllProducts the reviewRatingOfAllProducts to set
	 */
	public void setReviewRatingOfAllProducts(List<WebElement> reviewRatingOfAllProducts) {
		this.reviewRatingOfAllProducts = reviewRatingOfAllProducts;
	}

	/**
	 * @return the allCameraImages
	 */
	public List<WebElement> getAllCameraImages() {
		return allCameraImages;
	}

	/**
	 * @param allCameraImages the allCameraImages to set
	 */
	public void setAllCameraImages(List<WebElement> allCameraImages) {
		this.allCameraImages = allCameraImages;
	}

	/**
	 * @param allCameraProducts the allCameraProducts to set
	 */
	public void setAllCameraProducts(List<WebElement> allCameraProducts) {
		this.allCameraProducts = allCameraProducts;
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
	 * @return the allCameraProducts
	 */
	public List<WebElement> getAllCameraProducts() {
		return allCameraProducts;
	}

	

	/**
	 * @return the cameraPageHeading
	 */
	public WebElement getCameraPageHeading() {
		return cameraPageHeading;
	}

	/**
	 * @param cameraPageHeading the cameraPageHeading to set
	 */
	public void setCameraPageHeading(WebElement cameraPageHeading) {
		this.cameraPageHeading = cameraPageHeading;
	}

}
