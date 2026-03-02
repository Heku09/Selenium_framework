package Day_47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_w_PageFactory {
	
	WebDriver driver;
	
	//constructor
	POM_w_PageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_username_loc_1;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_password_loc_1;
	
	@FindBy(xpath ="//button[normalize-space()='Login']" )
	WebElement login_btn_1;
	
	//Actions
	public void setUserName1(String user) {
		txt_username_loc_1.sendKeys(user);
	}
	
	public void setUserPwd1(String pwd) {
		txt_password_loc_1.sendKeys(pwd);
	}
	
	public void clickloginBtn1() {
		login_btn_1.click();
	}

}
