package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		// total links on the page
		// get the text of each link
		// html tag = <a>
		// print only those links text which are not blank

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		// List<WebElement> linksList = driver.findElements(By.tagName("a"));
		By links = By.tagName("a");

		List<WebElement> linksList = getElements(links);

		System.out.println("total links: " + linksList.size());
		List<String> linksTextList = getElementsTextList(links);
		for (String e : linksTextList) {
			System.out.println(e);
		}

//		for(int i=0; i<linksList.size(); i++) {
//			String linkText = linksList.get(i).getText();
//				if(!linkText.isEmpty()) {
//					System.out.println(i+ "-->"+ linkText);
//				}
//		}
//		
//		for(WebElement e : linksList) {
//			String hrefVal = e.getAttribute("href");
//			System.out.println(hrefVal);
//		}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			if (!e.getText().isEmpty()) {
				eleTextList.add(e.getText());
			}
		}
		return eleTextList;
	}

}
