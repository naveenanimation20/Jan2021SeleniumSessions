package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	
	@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		obj.name = "loginTest";
		System.out.println(obj.name);
	}
	
	
}
