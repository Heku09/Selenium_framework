package Day_43_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_Assert {
	
	@Test
	void HardAssert() {
		System.out.println("statement1......");
		System.out.println("Statement2......");
		
		Assert.assertEquals("abc","xyq");
		
		System.out.println("Statement3.....");
		System.out.println("Statement4.....");
	}
	
	
	/*
	@Test
	void SoftAssert() {
		System.out.println("statement1......");
		System.out.println("Statement2......");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("abc","xyz");
		
		System.out.println("Statement3.....");
		System.out.println("Statement4.....");
		
		sa.assertAll(); // Mandatory when using softassert at the end
	}
	*/

}
