package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSendKeysAndClickConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver 2");		

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginButton = By.xpath("//input[@type='submit']");
		
//		WebElement emailEle = driver.findElement(emailId);
//		WebElement pwdEle = driver.findElement(password);
//		WebElement loginEle = driver.findElement(loginButton);
//
//		
//		Actions act = new Actions(driver);
//		act.sendKeys(emailEle, "naveenanimation20@gmail.com").perform();
//		act.sendKeys(pwdEle, "test123").perform();
//		act.click(loginEle).perform();
		doActionsSendKeys(emailId, "naveen@gmail.com");
		doActionsSendKeys(password, "test123");
		doActionsClick(loginButton);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).click(getElement(locator)).perform();
	}
	

}
