package Day_43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//TC1 -> if we need login and logout after every test(search/adv_search) then we use below methods
//1) Login --->  @BeforeMethod
//2) Search ---> @Test
//3) Logout ---> @AfterMethod
//4) Login --->  @BeforeMethod
//5) Adv Search ---> @Test
//6) Logout ---> @AfterMethod

public class BeforeMtd_AfterMtd {
	
	@BeforeMethod
	public void Login() {
		System.out.println("Login");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logout");
	}
	
	@Test(priority=1)
	public void Search() {
		System.out.println("Search");
	}
	
	@Test(priority=2)
	public void Adv_Search() {
		System.out.println("AdvSearch");
	}
  
}
