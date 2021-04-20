package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldPop {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String xpath_Current_Popu = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today = "//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String xpath_thisYear = "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		String xpath_today_thisYear = "//div[text()='Today' or text()='This year']//parent::div//span[@class='rts-counter']";
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/world-population/");

		int count = 1;
		while (count <= 20) {
			System.out.println(count + " sec");
			if (count == 20)
				break;
			System.out.println("-----Current World Population------");
			printElemetText(xpath_Current_Popu);
			System.out.println("-----Today------");
			printElemetText(xpath_today_thisYear);
			//System.out.println("-----This Year------");
			//printElemetText(xpath_thisYear);
			System.out.println("=========================================================");

			Thread.sleep(1000);
			count++;
		}
	}

	public static void printElemetText(String locator) {
//		driver
//			.findElements(By.xpath(locator))
//				.stream()
//					.forEach(e -> System.out.println(e.getText()));
		
		List<WebElement> eleList = driver.findElements(By.xpath(locator));
		for(WebElement e : eleList) {
			System.out.println(e.getText());
		}
	}

}
