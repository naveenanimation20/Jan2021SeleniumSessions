package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		//user actions: double click, right click, click, send keys
		//drag n drop , moveto element
		//Actions - class in Selenium
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

//		Actions act = new Actions(driver);
//		
//		WebElement content = driver.findElement(By.className("menulink"));
//		act.moveToElement(content).perform();
		
		doActionsMoveToElement(By.className("menulink"));//1
		
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("COURSES")).click();
		
		doActionsMoveToElementAndClick(By.linkText("COURSES"));//2
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsMoveToElement(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
	}
	
	public static void doActionsMoveToElementAndClick(By locator) {
		doActionsMoveToElement(locator);
		getElement(locator).click();
	}
	

}
