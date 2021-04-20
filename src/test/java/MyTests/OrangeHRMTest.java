package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{

	@Test(priority = 2)
	public void orangeHRMTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Free Human Resource Management Software | 30 Day Trial Creation");
	}

	@Test(priority = 3)
	public void orangeHRMUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm"));
	}

	@Test(priority = 1)
	public void orangeHRMFreeTrailButtonTest() {
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Assert.assertTrue(driver.findElement(By.cssSelector(".contact-ohrm")).isDisplayed());
	}

}
