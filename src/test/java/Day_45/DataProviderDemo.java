package Day_45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	
	 WebDriver driver; // we are adding here to be access for all the methods, 
	                   // if we add in specific method then it cannot be accessd by other methods
	
	@BeforeClass
	void LoginSetup() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(dataProvider="dp")
	void Login(String email,String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		Boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed(); // for validation and logout or else after valid login it will stop execution
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	
	@AfterClass
	void Teardown() {
		driver.close();
	}
	
	@DataProvider(name="dp")
	Object[][] TestData() {
		Object data[][]= {
				{"Abcd","Test@123"},
				{"QWERT","Training"},
				{"lhemnth@gmail.com","ABcd@@09"},
				{"12345","12345"},
				{"dsff","dsfsfd"}
		};
		return data;
	}

}
