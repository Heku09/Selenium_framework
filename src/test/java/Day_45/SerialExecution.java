package Day_45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SerialExecution {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void LoginSetUp(String br) throws InterruptedException {
		
		switch (br.toLowerCase()) {
		case "chrome": driver =new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		default:System.out.println("Invalid browser");
			return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	void LogoTest() {
		Boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
	}
	
	@Test
	void TitleTest() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@Test
	void UrlTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@AfterClass
	void TearDown() {
		driver.quit();
		
	}

}
