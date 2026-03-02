package Day_42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Relias {
	
	WebDriver driver;
	
  @Test(priority=1)
  public void OpenApp() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://divumtest.sportal.reliaslearning.de/");
	  driver.manage().window().maximize();	  
  }
  
  @Test(priority=2)
  public void TestLogo() {
	  boolean status=driver.findElement(By.xpath("//img[@class='logo img-fluid']")).isDisplayed();
	  System.out.println("Logo Displayed "+status);
  }
  
  @Test(priority=3)
  public void Login() {
	  driver.findElement(By.xpath("//input[@data-cy='username']")).sendKeys("heku");
	  driver.findElement(By.xpath("//input[@data-cy='password']")).sendKeys("training");
	  driver.findElement(By.xpath("//button[@data-cy='login-btn']")).click();
	  
  }
  
  @Test(priority=4)
  public void Logout() {
	  driver.quit();
	 
  }
  
}
