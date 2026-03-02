package Day_43_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	void test() {
		
		//Assert.assertEquals("xyz","xyz"); //Pass
		//Assert.assertEquals(123,345); //fail
		
		//Assert.assertEquals("abc",123); //fail
		//Assert.assertEquals("123",123); //fail
		
		//Assert.assertNotEqua1s(123,123); //fail
		//Assert.assertNotEqua1s(123,345); //Pass
		
		//Assert.assertTrue(true); //pass
		//Assert.assertTrue(false); //fail
		
		//Assert.assertTrue(1==2); //fail
		//Assert.assertTrue(1==1); //pass
		
		//Assert.assertFalse(1==2); //pass
	    //Assert.assertFalse(1==1); //fail
		
		//Assert.fail(); //Making the test fail forcefully
	}
}
