package Day_47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactorey {
	
	WebDriver driver;
	
	//Constriuctor
	Pagefactorey(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locator
	@FindBy(xpath="(//input[@placeholder='Username'])")
	WebElement username;
	
	@FindBy(xpath="(//input[@placeholder='Password'])")
	WebElement pwd;
	
	@FindBy(xpath="(//button[normalize-space()='Login'])")
	WebElement btn;
	
	//Action
	public void setusername(String user) {
		username.sendKeys(user);
	}
	
	public void setpwd(String pwd1) {
		pwd.sendKeys(pwd1);
	}
	
	public void clickbtn() {
		btn.click();
	}
	

}
