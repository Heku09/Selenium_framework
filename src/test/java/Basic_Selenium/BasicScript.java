package Basic_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.manage().timeouts().implicitlyWait(5);		
		String actual_title=driver.getTitle();
		
		if(actual_title.equals("OrangeHRM")) {
			System.out.println("title is " + actual_title);
		}
		
		else {
			System.out.println("test failed");
		}
		driver.quit();
	}
	

}
