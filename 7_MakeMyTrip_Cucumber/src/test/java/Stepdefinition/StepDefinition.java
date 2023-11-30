package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.MakeMyTrip;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	MakeMyTrip mt;
	WebDriverWait wait;

	@Given("Launch the Browser")
	public void launch_the_browser() {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}

	@When("user opens url: {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		mt=new MakeMyTrip(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Close the notification popup")
	public void close_the_notification_popup() throws InterruptedException {
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 40);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mt.getNotificationFrame()));
		//wait.until(ExpectedConditions.elementToBeClickable(mt.getNotificationFrameCloseBtn())).click();
		
	}

	@When("Close the login page")
	public void close_the_login_page() {
		wait.until(ExpectedConditions.elementToBeClickable(mt.getSigninFrameCloseBtn())).click();
	}

	@Then("Enter the From city - {string}")
	public void enter_the_from_city(String from) throws InterruptedException {
		mt.getFromCity().click();
		Thread.sleep(2000);
		mt.getFromCitySearchBtn().sendKeys(from);
		Thread.sleep(2000);
		mt.getFromCitySearchDropDown().click();
	}

	@Then("Enter the To City - {string}")
	public void enter_the_to_city(String to) throws InterruptedException {
		//Thread.sleep(1000);
		mt.getToCity().click();
		Thread.sleep(2000);
		mt.getToCitySearchBtn().sendKeys(to);
		Thread.sleep(2000);
		mt.getToCitySearchDropDown().click();
	}

	@Then("Enter the depature date")
	public void enter_the_depature_date() throws InterruptedException {
		Thread.sleep(2000);
		mt.getDepatureDate().click();
	}

	@Then("Enter the return date")
	public void enter_the_return_date() throws InterruptedException {
		mt.getReturnDateMainButton().click();
		Thread.sleep(2000);
		mt.getReturnDate().click();
	}

	@Then("Click search")
	public void click_search() {
		mt.getSearchBtn().click();
	}

	@Then("Check the page title - {string}")
	public void check_the_page_title(String string) throws InterruptedException {
		Thread.sleep(10000);
		mt.getPopup().click();
		
		
		WebElement pageTitle=mt.getTitle();
		
		System.out.println(pageTitle.getText());
		if(pageTitle.getText().equals("Flights from Hyderabad to Malmo, and back")) {
			System.out.println("Searched page is displayed");
		}
		else {
			System.out.println("Searched page is not displayed");
		}
	}

	@Then("close Browser")
	public void close_browser() {
		driver.close();
	}
}
