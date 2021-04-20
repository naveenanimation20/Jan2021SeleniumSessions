package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertPopUp {

	static WebDriver driver;

	public static void main(String[] args) {

		// WebDriverWait -- class in Selenium
		// extends FluentWait class --> implements Wait Interface -- until method
		// until method is implemented on FluentWait class
		//it can be applied for any webelement and non WEs (alert, url, title)

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		//wait for alert:
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
	}
	
	public static Alert waitForAlertPresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public String getAlertText(int timeOut) {
		return waitForAlertPresent(timeOut).getText();
	}
	
	public void acceptAlert(int timeOut) {
		waitForAlertPresent(timeOut).accept();
	}
	
	public void dismissAlert(int timeOut) {
		waitForAlertPresent(timeOut).dismiss();
	}

}
