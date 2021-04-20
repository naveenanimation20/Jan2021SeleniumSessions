package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		// selectDate("25");

		By calendar = By.cssSelector("table.ui-datepicker-calendar a");
		// selectDate(calendar, "24");
		// selectDate("15", "a");

		// curentMonthYear = display monthYear text
		// while(!(curentMonth == expMonth && curentYear == expYear))
		// click next icon

		// call selectDate(date) method

		selectCalendarFutureDate("15", "October", "2021");

	}

	public static String[] getMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	}

	public static void selectCalendarFutureDate(String exDay, String exMonth, String exYear) {

		if (exMonth.equals("February") && Integer.parseInt(exDay) > 29) {
			System.out.println("wrong date : " + exMonth + " : " + exDay);
			return;
		}

		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		while (!(getMonthYear(monthYearVal)[0].equals(exMonth) && getMonthYear(monthYearVal)[1].equals(exYear))) {
			// click on next icon
			System.out.println(monthYearVal);
			driver.findElement(By.xpath("//a[@title='Next']")).click();// May 2021
			monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		selectDate(exDay, "a");
	}

	public static void selectDate(String day, String htmlTag) {
		driver.findElement(By.xpath("//" + htmlTag + "[text()='" + day + "']")).click();
	}

	public static void selectDate(By locator, String day) {
		List<WebElement> daysList = driver.findElements(locator);

		System.out.println(daysList.size());

		for (WebElement e : daysList) {
			if (e.getText().equals(day)) {
				e.click();
				break;
			}
		}

	}

}
