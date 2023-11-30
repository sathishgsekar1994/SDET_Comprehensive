package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBtn;
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	
	@FindBy(id="nav-search-submit-button")
	WebElement MagnifierBtn;
	
	public WebElement getMagnifierBtn() {
		return MagnifierBtn;
	}
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	WebElement firstLink;
	
	public WebElement getFirstLink() {
		return firstLink;
	}
	
	@FindBy(xpath="//span[normalize-space()='50,999']")
	WebElement Price;
	
	public WebElement getPrice() {
		return Price;
	}
	

	public AmazonPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
