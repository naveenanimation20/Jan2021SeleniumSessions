package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpHandle {
	static WebDriver driver;
	public static void main(String[] args) {

//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click(); //child page
		
		//window handler API in selenium:
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id: " + childWindowId);
		
		switchToWindowAndGetTitle(childWindowId);
		br.closeBrowser();
		switchToWindowAndGetTitle(parentWindowId);
		
		
	}
	
	public static String switchToWindowAndGetTitle(String windowId) {
		driver.switchTo().window(windowId);
		String title = driver.getTitle();
		return title;
	}
	
	
	
	

}
