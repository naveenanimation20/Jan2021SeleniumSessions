package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {

		//headless - do not show the browser
		//fast
		//no browser display
		//not recommended -- not that stabled for complex application
		//only for sanity/smoke -- 5 to 10 TCS
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");//switch
		co.addArguments("--incognito");
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
