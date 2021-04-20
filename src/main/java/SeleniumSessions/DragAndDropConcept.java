package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
//		act.
//		clickAndHold(sourceEle).
//		moveToElement(targetEle).
//		release().
//		build().
//		perform();
		//1 action - .perform()
		//1 action - .build().perform()
		//>1 actions -- .build().perform()
		
		act.dragAndDrop(sourceEle, targetEle).perform();
		
	}

}
