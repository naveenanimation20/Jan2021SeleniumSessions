package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScoreCard {

	static WebDriver driver;

	public static void main(String[] args) {

		// a[text()='Devisha
		// Sharma']/parent::td/preceding-sibling::td/input[@type='checkbox']
		// a[text()='Neha
		// Patel']/parent::td/preceding-sibling::td/input[@type='checkbox']

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/south-africa-women-tour-of-india-2020-21-1253264/india-women-vs-south-africa-women-2nd-t20i-1253273/full-scorecard");

		//System.out.println(getWicketTakerName("Jemimah Rodrigues"));
		System.out.println(getWicketTakerName("Jemimah Rodrigues"));

		List<String> scoreList = getPlayerSocreCard("Jemimah Rodrigues");
		System.out.println(scoreList);
		
		
		
		
	}

	public static String getWicketTakerName(String playerName) {
		String xpath = "//a[contains(text(),'" + playerName + "')]//parent::td//following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public static List<String> getPlayerSocreCard(String playerName) {
		List<String> scoreValueList = new ArrayList<String>();
		List<WebElement> scoreList = driver.findElements(
				By.xpath("//a[contains(text(),'" + playerName + "')]//parent::td//following-sibling::td"));

		for (int i = 1; i < scoreList.size(); i++) {
			String score = scoreList.get(i).getText();

			if (!score.isEmpty()) {
				scoreValueList.add(score);
			}

		}
		return scoreValueList;
	}

}
