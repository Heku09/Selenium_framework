package Day_43_sub1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	
	@Test
	public void suite() {
		System.out.println("Suite");
	}
	
	@BeforeSuite
	void BS() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	void AS() {
		System.out.println("After Suite");
	}

}
