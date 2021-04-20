package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");		
		WebDriver driver = new ChromeDriver();//launch browser
		driver.get("http://www.google.com");//enter the url
		
		String title = driver.getTitle(); //get the title
		System.out.println("page title is: " + title);
		
		//verification/checkpoint: act vs exp:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
				
		
		//driver.quit();
		driver.close();//123
		
		driver = new ChromeDriver();//456
		driver.get("http://www.google.com");//enter the url -- 456
		
		System.out.println(driver.getTitle());
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//NoSuchSessionException: invalid session id
		
	}

}
