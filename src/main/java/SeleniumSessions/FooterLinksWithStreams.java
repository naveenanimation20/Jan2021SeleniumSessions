package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinksWithStreams {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		By footerLinks = By.cssSelector("ul.footer-nav a");
		
		ElementUtil eleUtil = new ElementUtil(driver);		
		eleUtil.printListElements(eleUtil.getElementsListWithText(footerLinks, 10, "Fresh"));
		
	}

}
