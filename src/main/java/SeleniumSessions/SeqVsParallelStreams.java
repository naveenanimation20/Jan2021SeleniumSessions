package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeqVsParallelStreams {

	public static void main(String a[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		//seq:
//		long stTime = System.currentTimeMillis();
//		linksList.stream().filter(ele -> !ele.getText().isEmpty()).forEach(ele -> System.out.println(ele.getText()));
//		long endTime = System.currentTimeMillis();
//		
//		System.out.println("Time taken: " +(endTime-stTime));
		//seq: Time taken: 7522ms -> 7.5 secs


		//parallel stream:
		long stTime = System.currentTimeMillis();
		linksList.parallelStream().filter(ele -> !ele.getText().isEmpty()).forEach(ele -> System.out.println(ele.getText()));
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: " +(endTime-stTime));
		//parallel: Time taken: 7094ms --> 7.1 secs
		//Time taken: 6034

		//data (more than 10k) -- parallel streams

	}

}
