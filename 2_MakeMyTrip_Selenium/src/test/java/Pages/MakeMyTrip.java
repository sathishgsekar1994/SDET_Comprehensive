package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTrip {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")
	WebElement closeBTN;
	
	public WebElement getcloseBTN() {
		return closeBTN;
	}
	


	public MakeMyTrip(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
