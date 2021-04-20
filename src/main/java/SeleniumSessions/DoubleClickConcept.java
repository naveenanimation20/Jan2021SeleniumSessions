package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickConcept {

	public static void main(String[] args) throws InterruptedException {

		//double click:
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.id("dblClkBtn"))).perform();
		
	}

}
