package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		//for windows:
		//System.setProperty("webdriver.chrome.driver", "c:\\documents\\driver\\chromedriver.exe");

		//for mac:
//		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");		
//		WebDriver driver = new ChromeDriver();//launch browser
//		driver.get("http://www.google.com");//enter the url
//		
//		String title = driver.getTitle(); //get the title
//		System.out.println("page title is: " + title);
//		
//		//verification/checkpoint: act vs exp:
//		if(title.equals("Google")) {
//			System.out.println("correct title");
//		}
//		else {
//			System.out.println("in-correct title");
//		}
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		
//		System.out.println(driver.getPageSource());
//		
//		
//		driver.quit();
		
		

			WebDriverManager.chromedriver().driverVersion("89.0.4389.23").setup();

			driver = new ChromeDriver();
			driver.get("https://www.worldometers.info/world-population/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			long startTime = System.currentTimeMillis(); //fetch starting time
			while(false||(System.currentTimeMillis()-startTime)<20000) {
				String worldPopulation = driver.findElement(By.xpath("//div[@class='maincounter-number']")).getText();
				
				String birthsToday = driver.findElement(By.xpath("//div[contains(text(),'Births today')]/following::div")).getText();
				
				String DeathsToday = driver.findElement(By.xpath("//div[contains(text(),'Deaths today')]/following::div")).getText();
				
				String popGrowthToday = driver.findElement(By.xpath("//div[contains(text(),'Population Growth today')]/following::div")).getText();
				
				String birthsThisYear = driver.findElement(By.xpath("//div[contains(text(),'Births this year')]/following::div")).getText();
				
				String deathsThisYear = driver.findElement(By.xpath("//div[contains(text(),'Deaths this year')]/following::div")).getText();
				
				String popGrowthThisYear = driver.findElement(By.xpath("//div[contains(text(),'Population Growth this year')]/following::div")).getText();
				
				System.out.println("current world population : "+ worldPopulation);
				
				System.out.println("Births today : "+ birthsToday);
				
				System.out.println("Deaths today :"+ DeathsToday);
				
				System.out.println("Population growth  today :"+ popGrowthToday);
				
				System.out.println("Births this year : "+ birthsThisYear);
				
				System.out.println("Deaths this year :"+ deathsThisYear);
				
				System.out.println("Population growth  this year :"+ popGrowthThisYear);
				
				

			}
			driver.quit();
		}
		
		
		
	}


