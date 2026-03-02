package Day_46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM_Listerners {
	
	
WebDriver driver;
	
	@BeforeClass
	void LoginSetUp() throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	void LogoTest() {
		Boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
	}
	
	@Test(priority=2)
	void TitleTest() {
		Assert.assertEquals(driver.getTitle(), "OrangeHR");
	}
	
	@Test(priority=3,dependsOnMethods = "TitleTest")
	void UrlTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@AfterClass
	void TearDown() {
		driver.quit();
		
	}

}
