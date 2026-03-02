package Day_47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_w_o_PageFactory {
	
	WebDriver driver;
	 
	@BeforeClass
	void setup() {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void action() {
		POM_w_o_PageFactory POM=new POM_w_o_PageFactory(driver);
		POM.setUserName("Admin");
		POM.setPassword("admin123");
		POM.clickloginBtn();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}

}
