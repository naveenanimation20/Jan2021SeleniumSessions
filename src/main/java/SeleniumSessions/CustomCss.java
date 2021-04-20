package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCss {

	public static void main(String[] args) {
		
		//id --> name --> css selector --> xpath
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		//css selector:
		//css: cascaded style sheet
		
		//id-> #{id} or htmltag#id
		//class-> .{classname} or htmltag.classname
		//#input-firstname
		//.form-control
		
		//.c1.c2.c3....cn
		//.form-control.private-form__control.login-email
		//.login-email
		// .login-email#username
		// #username.login-email
		// .form-control.private-form__control.login-email#username
		// #username.form-control.private-form__control.login-email
		// input#username.form-control.private-form__control.login-email
		By loc1 = By.className("form-control private-form__control login-email");
		By loc2 = By.xpath("//input[@class='form-control private-form__control login-email']");
		By loc3 = By.cssSelector(".form-control.private-form__control.login-email");
		By loc4 = By.className("login-email");
		
		// htmltag[attr='value']
	//	input[id='input-firstname']
		//input[@id='input-firstname']
		// input[name='username']
		
		// htmltag[attr1='value'][attr2='value']
		// input[name='username'][type='text']
		
	//	input[name*='user'] --contains
	//	input[name*='user'][type='text']
	//  input[name^='user'] --starts-with
	//  input[name$='name'] --ends-with
		
		//parent to child:
		// div.private-form__input-wrapper input[id='username'] --1
		// div.private-form__input-wrapper > input[id='username'] --1
		
		// ul.footer-nav li -- 31 (direct + indirect child element)
		// ul.footer-nav >li -- 31 (direct)
		
		// div.container div --57
		// div.container > div --7
		
		//not in css:
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
		// input.form-control.private-form__control:not(.login-email)
		// input.form-control.private-form__control:not(#password)
		
		//comma in css:
		// input#username, input#password, button#loginBtn, input#remember
		List<WebElement> formList = driver.
		  findElements
		   (By.cssSelector("input#username, input#password, button#loginBtn, input#remember"));
		if(formList.size() == 4) {
			System.out.println("all imp elements are present on the page....");
			
			for(WebElement e : formList) {
				System.out.println(e.isDisplayed());
			}
		}
		
		//nth-of-type:
		// ul.footer-nav li:nth-of-type(5) > a -- for 5th index
		// ul.list-unstyled li:nth-of-type(n) a -- for all elements
		
		//following sibling:
		//div.private-form__input-wrapper + div
	}

}
