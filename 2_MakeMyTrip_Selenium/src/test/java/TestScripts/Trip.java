package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.MakeMyTrip;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Trip {
	public static void main(String args[]) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//MakeMyTrip mt=new MakeMyTrip(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@title, 'notification-frame')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='wewidgeticon we_close']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']"))).click();
		
		String from = "Hyd";
		String to = "MMA";
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(from);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(to);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[5]/div/p")).click();
		
		
		driver.findElement(By.xpath("//p[contains(text(),'Tap to add a return date for bigger discounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[4]/div/p")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/p/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/span")).click();
		
		Thread.sleep(10000);
		WebElement pageTitle=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/p/span"));
		
		System.out.println(pageTitle.getText());
		if(pageTitle.getText().equals("Flights from Hyderabad to Malmo, and back")) {
			System.out.println("Searched page is displayed");
		}
		else {
			System.out.println("Searched page is not displayed");
		}
		driver.close();
	}
}
