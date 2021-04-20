package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		System.out.println(jsUtil.getTitleByJS());
		
		//jsUtil.refreshBrowserByJS();
		//jsUtil.generateAlert("this is my JS");
		
		//System.out.println(jsUtil.getPageInnerText());
//		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
//		WebElement login_form = driver.findElement(By.id("loginForm"));
//		jsUtil.drawBorder(login_form);
		
//		jsUtil.flash(login_form);
//		jsUtil.flash(login);
		
		//jsUtil.clickElementByJS(login);
		
//		jsUtil.scrollPageDown();
//		jsUtil.scrollPageUp();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Best Sellers in Home & Kitchen']"));
		jsUtil.scrollIntoView(ele);
		jsUtil.scrollPageDown("100");
		
	}

}
