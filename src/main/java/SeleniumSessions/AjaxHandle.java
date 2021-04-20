package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjaxHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/world-population/");

		Thread.sleep(5000);

		By pop = By.cssSelector("div.maincounter-number span.rts-nr-int");

//			List<WebElement> popuList = driver.findElements(pop);
//			
//			for(WebElement e : popuList) {
//				System.out.println(e.getText());
//				popuList = driver.findElements(pop);
//			}

//		while (true) {
//			List<WebElement> popList = waitForElementWithFluentWait(pop, 15, 500);
//			popList.stream().forEach(e -> System.out.println(e.getText()));
//			popList = waitForElementWithFluentWait(pop, 15, 500);
//		}

		test(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
				30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55,
				56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81,
				82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105,
				106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 
				1,2 ,3 ,4, 5, 6, 7, 8);
		System.out.println("Bye");

	}

	public static List<WebElement> waitForElementWithFluentWait(By locator, int timeout, long pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofMillis(pollingTime)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}

	public static void test(double a1, double a2, double a3, double a4, double a5, double a6, double a7,
			double a8, double a9, double a10, double a11, double a12, double a13, double a14, double a15, double a16,
			double a17, double a18, double a19, double a20, double a21, double a22, double a23, double a24, double a25,
			double a26, double a27, double a28, double a29, double a30, double a31, double a32, double a33, double a34,
			double a35, double a36, double a37, double a38, double a39, double a40, double a41, double a42, double a43,
			double a44, double a45, double a46, double a47, double a48, double a49, double a50, double a51, double a52,
			double a53, double a54, double a55, double a56, double a57, double a58, double a59, double a60, double a61,
			double a62, double a63, double a64, double a65, double a66, double a67, double a68, double a69, double a70,
			double a71, double a72, double a73, double a74, double a75, double a76, double a77, double a78, double a79,
			double a80, double a81, double a82, double a83, double a84, double a85, double a86, double a87, double a88,
			double a89, double a90, double a91, double a92, double a93, double a94, double a95, double a96, double a97,
			double a98, double a99, double a100, double a101, double a102, double a103, double a104, double a105,
			double a106, double a107, double a108, double a109, double a110, double a111, double a112, double a113,
			double a114, double a115, double a116, double a117, double a118, double a119, double a120, double a121,
			double a122, double a123, int a, int b, int c, int d, int n, int b1, int c1, int d1) {

	}

}
