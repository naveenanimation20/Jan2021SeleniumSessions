package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	/**
	 * Test Case: Global Pre Conditions: @BeforeSuite, @BeforeTest, @BeforeClass Pre
	 * Conditions: @BeforeMethod Test Steps: @Test, @DataProvider Actual vs Expected
	 * Result -- Assertions Post Steps : @AfterMethod Global Post steps
	 * : @AfterClass, @AfterTest, @AfterSuite
	 */
	
	/**
	 *  BS - createUserInDB
		BT - giveUserPermission
		BC -- Open the browser and launch App
		
			BM -- login to app
				Add To Cart Test -- T1
			AM -- logout

			BM -- login to app
				Search Product Test  - T2
			AM -- logout

			BM -- login to app
				app Logo Test -- T3
			AM -- logout
			
			BM -- login to app
				payment Test --T4
			AM -- logout

		AC -- close browser
		AT -- delete The User
		AS -- close DB Connection

	 */

	@BeforeSuite
	public void createUserInDB() {
		System.out.println("BS - createUserInDB");
	}

	@BeforeTest
	public void giveUserPermission() {
		System.out.println("BT - giveUserPermission");
	}

	@BeforeClass
	public void launchApp() {
		System.out.println("BC -- Open the browser and launch App");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM -- login to app");
	}

	@Test
	public void appLogoTest() {
		System.out.println("app Logo Test");
	}

	@Test
	public void SearchProductTest() {
		System.out.println("Search Product Test");
	}

	@Test
	public void AddToCartTest() {
		System.out.println("Add To Cart Test");
	}
	
	@Test
	public void paymentTest() {
		System.out.println("payment Test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close browser");
	}

	@AfterTest
	public void deleteTheUser() {
		System.out.println("AT -- delete The User");
	}

	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS -- close DB Connection");
	}

}
