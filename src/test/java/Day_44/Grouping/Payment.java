package Day_44.Grouping;

import org.testng.annotations.Test;

public class Payment {
	
	@Test(priority=1,groups = {"sanity","regression","functional"})
	void Cash() {
		System.out.println("This is payment by cash");
	}
	
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void Dollars() {
		System.out.println("This is payment by dollars");
	}

}
