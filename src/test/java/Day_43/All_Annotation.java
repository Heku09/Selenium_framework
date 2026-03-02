package Day_43;

import org.testng.annotations.*;

public class All_Annotation {
	
	@Test
	void test() {
		System.out.println("This is Test");
	}
	
	@BeforeMethod
	 void BM() {
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	void AM() {
		System.out.println("This is After Method");
	}
	
	@AfterClass
	void AC() {
		System.out.println("This is After class");
	}
	
	@BeforeClass
	void BC() {
		System.out.println("This is Before Class");
	}
	
	@BeforeTest
	void BT() {
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	void AT() {
		System.out.println("This is After Test");
	}
	
	@AfterSuite
	void AS() {
		System.out.println("This is After Suite");
	}
	
	@BeforeSuite
	void BS() {
		System.out.println("This is Before Suite");
	}

}
