package Day_44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsMethod {
	
	private static final boolean True = true;

	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(false);
		System.out.println("1");
	}

	@Test(priority=2,dependsOnMethods = "openapp")
	void login() {
		Assert.assertTrue(true);
		System.out.println("2");
	}
	
	@Test(priority=3,dependsOnMethods = {"login","openapp"})
	void search() {
		Assert.assertTrue(true);
		System.out.println("3");
	}
	
	@Test(priority=4)
	void adv_search() {
		Assert.assertTrue(True);
		System.out.println("4");
	}
	
	@Test(priority=5)
	void logout() {
		Assert.assertTrue(True);
		System.out.println("5");
	}
}
