package Day_45;

import java.time.Duration;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParallelExecution {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	void setup(String pr) throws InterruptedException {
		
		switch (pr.toLowerCase()) {
		case "chrome": driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
	    
		default:System.out.println("Invalid browser");
			return;
		}
		
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		Thread.sleep(3000);
	}
	
	@Test
	void LogoTest() {
		Boolean status=driver.findElement(By.xpath("//a[normalize-space()='Qafox.com']")).isDisplayed();
		Assert.assertEquals(true, status);
	}
	
	@Test
	void TitleTest() {
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}
	
	@Test
	void UrlTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	@AfterClass
	void TearDown() {
		driver.close();
	}

}
