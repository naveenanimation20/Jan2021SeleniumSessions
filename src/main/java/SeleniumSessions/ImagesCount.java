package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesCount {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		By image = By.tagName("img");
		List<String> altList = getElementAttrList(image, "alt");
		List<String> srcList =  getElementAttrList(image, "src");
		
		System.out.println(altList.size());
		System.out.println(srcList.size());

//		List<WebElement> imageList = driver.findElements(By.tagName("img"));
//
//		System.out.println("total images: " + imageList.size());
//
//		for (WebElement e : imageList) {
//			String altValue = e.getAttribute("alt");
//			String srcValue = e.getAttribute("src");
//
//			System.out.println(altValue);
//			System.out.println(srcValue);
//		}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementAttrList(By locator, String attrName) {
		List<String> attrList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		
		for(WebElement e : eleList) {
			attrList.add(e.getAttribute(attrName));
		}
		return attrList;
	}

}
