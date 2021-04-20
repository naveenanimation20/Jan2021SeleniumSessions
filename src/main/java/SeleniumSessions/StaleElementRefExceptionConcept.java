package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExceptionConcept {
		
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://classic.crmpro.com/index.html");//v1
			By username = By.name("username");//v1
			
			WebElement user_ele = driver.findElement(username);//v1
			user_ele.sendKeys("batchautomation");//v1
			
			Thread.sleep(3000);
			
			driver.navigate().refresh();
			
			//v2 --DOM
			//v2 -- e
			
			user_ele = driver.findElement(username);
			user_ele.sendKeys("batchautomation");
		
	}

}
