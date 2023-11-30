package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Maven_Program extends TestBase{
	@Test(priority = 1)
	public void AmazonPrice() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		ap.getSearchBtn().sendKeys("iphone");
		ap.getMagnifierBtn().click();
		Thread.sleep(3000);
		ap.getFirstLink().click();
		System.out.println(ap.getPrice().getText());
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 2)
	public void MyTrip() throws InterruptedException {
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wait = new WebDriverWait(driver, 40);
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']"))).click();
		
		String from = "Hyd";
		String to = "MMA";
		
		mmt.getFromCity().click();
		Thread.sleep(2000);
		mmt.getFromCitySearchBtn().sendKeys(from);
		Thread.sleep(2000);
		mmt.getFromCitySearchDropDown().click();
		
		mmt.getToCity().click();
		Thread.sleep(2000);
		mmt.getToCitySearchBtn().sendKeys(to);
		Thread.sleep(2000);
		mmt.getToCitySearchDropDown().click();
		Thread.sleep(2000);
		mmt.getDepatureDate().click();
		mmt.getReturnDateMainButton().click();
		Thread.sleep(2000);
		mmt.getReturnDate().click();
		mmt.getSearchBtn().click();
		Thread.sleep(10000);
		mmt.getPopup().click();
		Thread.sleep(2000);
		

		System.out.println(mmt.getTitle().getText());
		if(mmt.getTitle().getText().equals("Flights from Hyderabad to Malmo, and back")) {
			System.out.println("Searched page is displayed");
		}
		else {
			System.out.println("Searched page is not displayed");
		}
	}
	
	@Test(priority = 3)
	public void GoogleSearch() throws InterruptedException {
		driver.get("https://www.google.co.in/");
		gp.getSearchBtn().sendKeys("Selenium");
		gp.getSearchBtn().sendKeys(Keys.ENTER);
		
		int numberOfLinks = driver.findElements(By.tagName("a")).size();
        System.out.println("Number of links on Web Page :" +numberOfLinks );
		Thread.sleep(3000);
	}
}
