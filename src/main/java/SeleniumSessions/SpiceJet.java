package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
	static WebDriver Driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.spicejet.com");
		Thread.sleep(2000);
		doActionsMoveToElement(By.id("ctl00_HyperLinkLogin"));
		Thread.sleep(2000);
		doActionsMoveToElement(By.xpath("//a[text()='SpiceClub Members']"));

		Thread.sleep(2000);
		// doActionsMoveToElement(By.xpath("//a[text()='Member Login']"));

		Actions act = new Actions(Driver);
		act.click(Driver.findElement(By.xpath("(//a[text()='Member Login'])[2]"))).perform();
		
	}
	
	

	public static WebElement getElement(By locator) {
		return Driver.findElement(locator);
	}

	public static void doActionsMoveToElement(By locator) {
		Actions act = new Actions(Driver);
		act.moveToElement(getElement(locator)).perform();
	}

	public static void doActionsMoveToElementAndClick(By locator) {
		doActionsMoveToElement(locator);
		getElement(locator).click();

	}

}
