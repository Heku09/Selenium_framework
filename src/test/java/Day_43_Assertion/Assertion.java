package Day_43_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	void asserttest() {
		String act_title="ABC";
		String exp_title="Axyz";
		
		//1) conditional statement
		/*
		 * if(act_title.equals(exp_title)) { 
		 * System.out.println("pass"); 
		 * } 
		 * else{
		 * System.out.println("fail"); 
		 * }
		 */
		
		//2) Assertion
		//Assert.assertEquals(act_title, exp_title);
		
		//3) Conditional with assertion
		if(act_title.equals(exp_title)) { 
			 System.out.println("pass"); 
			 Assert.assertTrue(true);
			 } 
			 else{
			 System.out.println("fail");
			 Assert.assertTrue(false);
			 }		
	}

}
