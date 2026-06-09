package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test {
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		driver=new ChromeDriver();
		driver.get("https://divumtest.sportal.reliaslearning.de/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	@Test
	void Logotest() {
		Boolean status=driver.findElement(By.xpath("//img[@class='logo img-fluid']")).isDisplayed();
		Assert.assertEquals(true, status);
	}
	
	@Test
	void TitleTest() {
		Assert.assertEquals(driver.getTitle(), "Relias Authentication");
	}
	
	@Test
	void UrlTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://divumtest.sportal.reliaslearning.de/");
	}
	
	@AfterClass
	void TearDown() {
		driver.quit();
	}

}
