package Day_43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//TC2 -> if we need login and logout only once before and after all the test test(search/adv_search) then we use below methods
//1) Login --->  @BeforeClass
//2) Search ---> @Test
//3) Adv Search ---> @Test
//4) Logout ---> @AfterClass

public class BeforeClass_AfterClass {
	
	@BeforeClass
	public void Login() {
		System.out.println("Login");
	}
	
	@AfterClass
	public void Logout() {
		System.out.println("Logout");
	}
	
	@Test(priority=2)
	public void Search() {
		System.out.println("Search");
	}
	
	@Test(priority=1)
	public void Adv_Search() {
		System.out.println("Adv_Search");
	}
}
