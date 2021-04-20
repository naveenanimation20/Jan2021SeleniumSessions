package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUserWithHashMap {
	static WebDriver driver;
	public static void main(String[] args) {

		//RBAC -- user permission
		//product meta data: <name:"macbook"> <price:101> <seller:"abc">
		//customer, admin, categorymanager, seller, vendor, distributor
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		doLogin("seller");
		doLogin("vendor");
		doLogin("customer");
		doLogin("distributor");

	}
	
	public static void doLogin(String role) {
		String creds[] = getCredentialsMap(role).split(":");
		System.out.println(creds[0] + " : " + creds[1]);
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginButton = By.xpath("//input[@value='Login']");
		
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(creds[0].trim());
		
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(creds[1].trim());
		
		driver.findElement(loginButton).click();

	}
	
	public static String getCredentialsMap(String role) {
		Map<String, String> credMap = new HashMap<String, String>();
		credMap.put("admin", "admin@g.com:admin123");
		credMap.put("seller", "seller@g.com:seller123");
		credMap.put("vendor", "vendor@g.com:vendor123");
		credMap.put("customer", "customer@g.com:cust123");
		credMap.put("partner", "partner@g.com:partner123");
		credMap.put("distributor", "distributor@g.com:distributor123");

		if(credMap.containsKey(role)) {
			return credMap.get(role);
		}
		return null;
	}
	
	

}
