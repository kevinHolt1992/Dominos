package POM;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	WebDriver driver;
	
	public POM(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[.=\"OUR MENU\"]")
	private WebElement HomePageOurMenu;
	
	@FindBy(xpath = "//a[.=\"View All\"]")
	private WebElement OurMenuPageViewAll;
	
	@FindBy(xpath = "//body/div[@class='main-wrapper col-xs-12']/div[@id='content-box']/div[@class='main-wrapper cont-wrap col-xs-12 pd-N']/div[@id='content-box']/div[@class='container-fluid']/div[@class='pg-content mob-height col-xs-12']/div[@class='row']/div[@class='tab-content col-xs-12 sub-menu-content']/div[@id='pizza']/div[@class='tab-content col-xs-12 pd-N']/div[@id='veg-pizzas']/div[@class='col-xs-12 product-box our-menu-box']/div[@class='row vertical-box displayFlex']/div[1]/div[1]/a[1]")
	private WebElement BtnHomePageOrderNow;

	public WebElement getHomePageOurMenu() {
		return HomePageOurMenu;
	}

	public WebElement getOurMenuPageViewAll() {
		return OurMenuPageViewAll;
	}

	public WebElement getBtnHomePageOrderNow() {
		return BtnHomePageOrderNow;
	}
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[1]/button[1]")
	private WebElement btnDontAllow;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[1]/div[2]/div/div[2]/div[1]/div/div[3]")
	private WebElement txtsearchclk;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div/div[1]/input")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[2]/div/ul/li[1]")
	private WebElement btselectLocation;
	
	
	public WebElement getBtselectLocation() {
		return btselectLocation;
	}

	public WebElement getBtnDontAllow() {
		return btnDontAllow;
	}

	public WebElement getTxtsearchclk() {
		return txtsearchclk;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	@FindBy(xpath = "//div[@class='sc-kjoXOD hufhcG']//span[text()='VEG PIZZA']")
	private WebElement TagVegPizza;
	
	@FindBy(xpath = "//div[@class='sc-kjoXOD hufhcG']//span[text()='BEVERAGES']")
	private WebElement TagBeverages;
	
	public WebElement getTagBeverages() {
		return TagBeverages;
	}

	@FindBy(xpath = "//span[text()='NO THANKS']")
	private WebElement BtnoThanks;
	
	@FindBy(xpath = "(//div[@data-label='Margherita'])[1]//span[text()='ADD TO CART']")
	private WebElement btnmarAddtocart;
	
	@FindBy(xpath = "(//div[@data-label='Pepsi 475ml'])[1]//span[text()='ADD TO CART']")
	private WebElement btpepsiAddToCart;
	
	public WebElement getBtpepsiAddToCart() {
		return btpepsiAddToCart;
	}
	
	public WebElement getBtnPepsiAdd() {
		return btnPepsiAdd;
	}
	
	@FindBy(xpath = "//button[@data-label='miniCartCheckout']")
	private WebElement btnCheckout;
	public WebElement getBtnCheckout() {
		return btnCheckout;
	}

	@FindBy(xpath = "(//div[@data-label='Pepsi 475ml'])[1]//div[@class='sc-iELTvK cYbiOn']//div[@class='itm-dsc__actn__adCrt']//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy']")
	private WebElement btnPepsiAdd;
	
	@FindBy(xpath = "(//div[@data-label='Pepsi 475ml'])[1]//div[@class='sc-iELTvK cYbiOn']//div[@class='itm-dsc__actn__adCrt']//div[@class='injectStyles-sc-1jy9bcf-0 kYAlCU']")
	private WebElement btnPepsiminus;

	public WebElement getBtnPepsiminus() {
		return btnPepsiminus;
	}

	@FindBy(xpath = "(//div[@data-label='Peppy Paneer'])[1]//span[text()='ADD TO CART']")
	private WebElement btnPaneerAddtocart;
	
	@FindBy(xpath = "(//div[@data-label='Margherita'])[1]//div[@class='sc-iELTvK cYbiOn']//div[@class='itm-dsc__actn__adCrt']//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy']")
	private WebElement btnmarAdd;
	
	@FindBy(xpath = "(//div[@data-label='Peppy Paneer'])[1]//div[@class='sc-iELTvK cYbiOn']//div[@class='itm-dsc__actn__adCrt']//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy']")
	 private WebElement btnpaneerAdd;

	public WebElement getTagVegPizza() {
		return TagVegPizza;
	}

	public WebElement getBtnoThanks() {
		return BtnoThanks;
	}

	public WebElement getBtnmarAddtocart() {
		return btnmarAddtocart;
	}

	public WebElement getBtnPaneerAddtocart() {
		return btnPaneerAddtocart;
	}

	public WebElement getBtnmarAdd() {
		return btnmarAdd;
	}

	public WebElement getBtnpaneerAdd() {
		return btnpaneerAdd;
	}
	
}
