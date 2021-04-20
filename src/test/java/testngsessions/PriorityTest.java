package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test()
	public void a_test() {

	}

	@Test()
	public void b_test() {

	}

	@Test()
	public void c_test() {

	}

	@Test(priority = 1)
	public void d_test() {

	}

	@Test(priority = 2)
	public void e_test() {

	}

	@Test(priority = 3)
	public void f_test() {

	}

}
