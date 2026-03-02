package Day_43_sub1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	@Test
	public void xyz() {
		System.out.println("XYZ");
	}
	
	@BeforeTest
	void BT() {
		System.out.println("Before Test");
	}

}
