package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		//create the webelement + perform the action(click, sendkeys, get text, isDisplayed)
		//1st. id: is a unique attribute -- I
		//1st:
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test123");
		
		//2nd:
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("test123");
		
		//3rd: By locators:
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		driver.findElement(emailId).sendKeys("naveen@gmail.com");
//		driver.findElement(password).sendKeys("test@123");
		
		//4th: By locators + webelement
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement email_ele = driver.findElement(emailId);
//		WebElement password_ele = driver.findElement(password);
//		
//		email_ele.sendKeys("naveen@gmail.com");
//		password_ele.sendKeys("test@123");
		
		//5th: generic method
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId, "naveen@gmail.com");
//		getElement(password, "test@123");
		
		//6th:
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By registerLink = By.linkText("Register");
		
//		doSendKeys(emailId, "naveen@gmail.com");
//		doSendKeys(password, "test@123");
		
		//2nd: name: -- II
		//driver.findElement(By.name("username")).sendKeys("testautomation");
		
		//3rd: class name: its not a unique element -- III
		//we have to use only we have unique class name for that element
//		driver.findElement(By.className("test")).sendKeys("testing");
//		driver.findElement(By.className("button btn btn-default button-medium")).click();
		
		//4th: link text: only for links
		//driver.findElement(By.linkText("Register")).click();
		//doClick(registerLink);
		
		//5th: partial link text: only for links
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//Forgotten pwd
		//Forgotten un
		
		//6th: xpath: is not an attribute
		//address of the element inside the html DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).click();
		
//		By un = By.xpath("//*[@id=\"input-email\"]");
//		doSendKeys(un, "naveen@gmail.com");
		
		//7th: cssSelector: is not an attribute
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
		
		//8th : tagName:
//		String text = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(text);
		
		By header = By.tagName("h2");
		String text = doGetText(header);
		System.out.println(text);
		
		By customerLink = By.linkText("Customers");
		System.out.println(doGetText(customerLink));
		
		//System.out.println(driver.findElement(By.linkText("Customers")).isDisplayed());
		System.out.println(doIsDisplayed(header));
		System.out.println(doIsDisplayed(customerLink));
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	

}
