package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsInSelenium {

	public static void main(String[] args) {

		//1. static wait -> Thread.sleep - 10 
		//2. dynamic wait -> time out is dynamic
			//a. Implicitly wait
			//b. Explicit Wait
				//b.1: WebDriverWait
				//b.2: FluentWait
					//WebDriverWait extends FluentWait
					//implementing Wait Interface
		
		//Implicitly Wait:
			//--is a global wait
			//only for web elements
			//not applicable for non web elements: alert, url, title
			//FE/FEs -- by default imp wait will be applied
			//it will be applied after driver initialization
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/index.html");
		//login page:
		driver.findElement(By.name("username")).sendKeys("groupautomation");//2 -- 8
		driver.findElement(By.name("password")).sendKeys("Test@12345");//0
		driver.findElement(By.xpath("//input[@value='Login']")).click();//0
		
		//home page: 5
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//e3//5 -- 5
		//e4 //0 
		//e5 //0 
		
		//contacts page:
		//nullify imp wait:
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//e6
		//e7
		//e8
		//e9 -- logout
		//login page:
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//e1 e2 e3 -- 10 secs
		
		
	}

}
