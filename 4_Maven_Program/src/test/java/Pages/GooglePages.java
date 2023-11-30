package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages {
	WebDriver driver;
	@FindBy(name="q")
	WebElement searchBtn;
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	@FindBy(tagName ="a")
	WebElement links;
	
	public WebElement getlinks() {
		return links;
	}
	
	public GooglePages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
