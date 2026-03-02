package Day_47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_w_o_PageFactory {
	
	WebDriver driver;
	
	// COnstructor
	POM_w_o_PageFactory(WebDriver driver){
		this.driver=driver;
	}
	
	// Locators
	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
    By login_btn_loc=By.xpath("//button[normalize-space()='Login']");
    
    //Action needed
    public void setUserName(String user) {
    	driver.findElement(txt_username_loc).sendKeys(user);
    }
    
    public void setPassword(String pwd) {
    	driver.findElement(txt_password_loc).sendKeys(pwd);
    }
    
    public void clickloginBtn() {
    	driver.findElement(login_btn_loc).click();
    }

}
