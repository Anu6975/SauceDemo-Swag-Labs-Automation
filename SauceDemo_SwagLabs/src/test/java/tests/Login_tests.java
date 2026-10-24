package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import Base.BaseTest;
import Page.*;
import utilities.*;

public class Login_tests extends BaseTest {
	String isLoggedin = "https://www.saucedemo.com/inventory.html";
	
	@Test(dataProvider = "login")
	void login(String username, String password, boolean expectedResult) throws InterruptedException {
		Login_Page log = new Login_Page(driver);
		log.username(username);
		Thread.sleep(3000);
		log.password(password);
		Thread.sleep(3000);
		log.loginButton();
		
		Thread.sleep(3000);
		
		boolean actualResult = driver.getCurrentUrl().equals(isLoggedin);
		Assert.assertEquals(expectedResult, actualResult);
		
	}
	
	@DataProvider(name = "login")
	public Object[][] loginData(){
		return new Object[][] {
			{"standard_user","secret_sauce" , true},
			{"locked_out_user", "secret_sauce", false},
			{"problem_user", "secret_sauce", true},
			{"performance_glitch_user", "secret_sauce", true},
			{"error_user", "secret_sauce", true},
			{"visual_user", "secret_sauce", true}
			};
	}
	
	@AfterMethod
	void logout() throws InterruptedException {
		OpenMenu_Page lgout = new OpenMenu_Page(driver);
//		AlertUtils al = new AlertUtils(driver);
		Waits s = new Waits(driver);
		if(driver.getCurrentUrl().equals(isLoggedin)) {
			
			Thread.sleep(3000);
			lgout.openMenu();
			s.implicit();
			Thread.sleep(3000);
			lgout.logout();	
			Thread.sleep(3000);
		}
	
	}

}
