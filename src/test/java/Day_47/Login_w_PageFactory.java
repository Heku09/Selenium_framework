package Day_47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_w_PageFactory {
	
	WebDriver driver;
	 
	@BeforeClass
	void setup() {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void action() {
		POM_w_PageFactory POM=new POM_w_PageFactory(driver);
		POM.setUserName1("Admin");
		POM.setUserPwd1("admin123");
		POM.clickloginBtn1();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}

}

