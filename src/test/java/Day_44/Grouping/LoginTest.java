package Day_44.Grouping;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1, groups="sanity")
	void EmailLogin() {
		System.out.println("this is email login");
	}
	
	@Test(priority=2, groups="sanity")
	void FacebookLogin() {
		System.out.println("this is facebook login");
	}
	
	@Test(priority=3, groups="sanity")
	void TwitterLogin() {
		System.out.println("this is twitter login");
	}

}
