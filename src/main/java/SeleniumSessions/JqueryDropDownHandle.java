package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);

		By choice = By.cssSelector(".comboTreeItemTitle");

		// tc1: single selection:
		// selectChoice(choice, "choice 3");

		// tc2: multi selection:
		// selectChoice(choice, "choice 1", "choice 2", "choice 3");
		// selectChoice(choice, "choice 7", "choice 6 2 2", "choice 6 2 1", "choice 2
		// 3", "choice 4");

		// tc3: all selection:
		selectChoice(choice, "selectall");
		
		//selectChoice(choice, null);
	}

	public static void selectChoice(By locator, String... value) {
		
		List<WebElement> choiceList = driver.findElements(locator);

		if (!value[0].equalsIgnoreCase("selectall")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}

			}
		}
		// select all the values:
		else {
			try {
				for (WebElement e : choiceList) {
					e.click();
				}
			} catch (Exception e) {

			}
		}
	}

}
