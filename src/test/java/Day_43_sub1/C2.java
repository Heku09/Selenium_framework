package Day_43_sub1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {
	
	@Test
	 void abc() {
		System.out.println("ABC");
	}
	

	@AfterTest
	void AT() {
		System.out.println("After Test");
	}


}
