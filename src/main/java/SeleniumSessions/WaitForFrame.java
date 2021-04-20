package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForFrame {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		By frame = By.name("main");
		//An expectation for checking whether the given frame is available to switch to.
		//If the frame is available it switches the given driver to the specified frame.
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));

		waitForFrameAndSwitchToIt("main", 5);
		
		String text = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		
	}
	
	public static void waitForFrameAndSwitchToIt(String idOrName, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	
	public static void waitForFrameAndSwitchToIt(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	public static void waitForFrameAndSwitchToIt(int index, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	
	public static void waitForFrameAndSwitchToIt(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	

}
