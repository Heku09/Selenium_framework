package Day_47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Login {
	
	WebDriver driver;
		
		@BeforeClass
		void Setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test
	void login() {
		Pagefactorey pf=new Pagefactorey(driver);
		pf.setusername("Admin");
		pf.setpwd("admin123");
		pf.clickbtn();
	}
	
	@AfterClass
	void logout() {
		driver.quit();
	}

}
