package Day_44.Grouping;

import org.testng.annotations.Test;

public class SignUp {
	
	@Test(priority=1, groups="regression")
	void EmailSignUp() {
		System.out.println("This is email sign up");
	}

	@Test(priority=2, groups="regression")
	void FacebookSignUp() {
		System.out.println("This is Facebook sign up");
	}
	
	@Test(priority=3, groups="regression")
	void TwitterSignUp() {
		System.out.println("This is Twitter sign up");
	}
}
