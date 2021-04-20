package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomXpath_1 {

	public static void main(String[] args) {

		//xpath:
		//1. abs xpath: /html/body/div/div[2]/div[1]/ul/li/span -- text
		//2. relative /custom xpath:use diff xpath features and functions
		
		//htmltag[@attr='value']
		//input[@id='Form_submitForm_FirstName']--1
		//input[@name='FirstName']--1
		//input[@type='text'] --6
		
		//htmltag[@attr1='value' and @attr2='value' and @attr3='value']
		//input[@id='Form_submitForm_FirstName' and @type='text']
		//input[@id='Form_submitForm_FirstName' and @type='text' and @name]
		//input[@id='Form_submitForm_FirstName' and @type and @name]
		//input[@id and @type and @name] --17
		
		By email = By.xpath("//input[@class='form-control private-form__control login-email']");//right
		By email1 = By.className("//input[@class='form-control private-form__control login-email']");//wrong

		//index:
		// (//input[@type='text'])[1]
		// (//input[@type='text'])[position()=1]
		
		//text(): used for elements where text is already available:
		//h1 h2 h3 span li link
		//h2[text()='Refreshing business software that your teams will love']
		//ul[@class='footer-nav']//a[text()='Customers']
		//h3[text()='Marketing Campaigns']
		
		//contains(): is used to handle dynamic elements with dynamic text and attributes:
		//htmltag[contains(@attr,'value')]
		//input[contains(@id,'input-email')]
		//input[contains(@id,'email')]
//		<input id=test_123>
//		<input id=test_134>
//		<input id=test_124>
//		<input id=test_125>
		//input[contains(@id,'test_')]
		
		//htmltag[contains(text(),'value')]
		//h2[contains(text(),'Refreshing business software')]
		
		//htmltag[contains(@attr,'value') and contains(text(),'value')]
		//htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
		//input[contains(@id,'_FirstName') and contains(@name,'First')]
		//input[contains(@class,'login-email')]
		
		//starts-with()
		//h2[starts-with(text(),'Refreshing')]
		
		//htmltag[contains(@attr1,'value') and starts-with(@attr2,'value')]
		//input[contains(@id,'user') and starts-with(@type,'email')]
		
		//parent-child:
		//ul[@class='footer-nav']/li -- only direct child elements
		//ul[@class='footer-nav']//li -- direct + indirect child elements
		//div[@class='private-form__input-wrapper']/child::input[@id='username']
		
		//child to parent:
		//input[@id='username']/../../../../../../../../../..
		//input[@id='username']/parent::div
		
		//child to ancestor:
		//input[@id='username']/ancestor::div
		
		//radio button:
		// (//label[@class='radio-inline'])[position()=1]/input
		// (//label[@class='radio-inline'])[position()=2]/input
		
		//label[normalize-space()='No']
		//label[normalize-space()='Yes']
		
		//*[@id="username"]-300
		//input[@id="username"]-10
		
	}

}
