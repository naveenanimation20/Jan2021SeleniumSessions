package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	//dependenct bw multiple test cases, is it a good idea?
	//its not recommended
	//testcases should be independent
	//test case should be wrriten for a specific feature
	//test case should have only one or max two asssertions
	//multi assertions -- you can have soft assertions for the single features
	//login feature: username, pwd, login button is displayed or not--- 3 soft assertions
	
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("home test");
	}
	
	@Test(dependsOnMethods = "homeTest")
	public void profileTest() {
		//logo
		//name
		//account info
		//email
		//reset pwd
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("Search test");
	}
	
	
	
	

}
