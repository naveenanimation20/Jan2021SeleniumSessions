package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		//select the value fromt the drop down without using Select class
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		By indusOptions = By.cssSelector("select#Form_submitForm_Industry option");
		
//		List<WebElement> list = 
//				driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));
		
		doSelectDropDownValueWithoutSelect(indusOptions, "Travel");
		
	}
	
	public static void doSelectDropDownValueWithoutSelect(By locator, String value) {
		List<WebElement> list = 
				driver.findElements(locator);
		
		for(WebElement e : list) {
			if(e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}

}
