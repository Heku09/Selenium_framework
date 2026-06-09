package Day_42;

import org.testng.annotations.Test;

public class FirstAnnotationExample {

	
	@Test(priority=2)
	void openapp() {
		System.out.println("Application is opened");
	}
	
	@Test(priority=3)
	void login() {
		System.out.println("Logged IN");
	}
	
	@Test(priority=1)
	void logout() {
		System.out.println("Logged out");
	}

}