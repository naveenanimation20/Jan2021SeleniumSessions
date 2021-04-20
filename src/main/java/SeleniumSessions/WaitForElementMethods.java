package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementMethods {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		By footer = By.cssSelector("ul.footer-nav li a");
		By images = By.tagName("img");

//		List<WebElement> footerList = waitForVisibilityOfElements(footer, 10);
//		
//		for(WebElement e : footerList) {
//			System.out.println(e.getText());
//		}

//		int footerCount = getElementsTextList(footer, 10).size();
//		System.out.println(footerCount);
		
		//total links and images on the page:
		int imagesCount = waitForPresentOfElements(images, 10).size();
		System.out.println(imagesCount);
	}

	public static List<WebElement> waitForVisibilityOfElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	/**
	 * This method is specifically for tagName
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForPresentOfElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	public static List<String> getElementsTextList(By locator, int timeOut) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = waitForVisibilityOfElements(locator, timeOut);
		for (WebElement e : eleList) {
			if (!e.getText().isEmpty()) {
				eleTextList.add(e.getText());
			}
		}
		return eleTextList;

	}
	
	/**
	 * An expectation for checking an element is visible and enabled 
	 * such that you can click it.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementToBeClickable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void clickWhenReady(By locator, int timeOut) {
		waitForElementToBeClickable(locator, timeOut).click();
	}
	
	

}
