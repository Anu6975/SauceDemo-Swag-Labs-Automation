package Page;

import org.openqa.selenium.*;

public class Login_Page {
	WebDriver driver;
//	private final String passwordvalue = "secret_sauce";
 	
	public Login_Page(WebDriver driver){
		this.driver=driver;
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By login_Button = By.id("login-button");
	
	public void username(String usernames) {
		WebElement user = driver.findElement(username);
		user.clear();
		user.sendKeys(usernames);
	}
	
	public void password(String passwordValue) {
		WebElement pass = driver.findElement(password);
		pass.clear();
		pass.sendKeys(passwordValue);
	}
	
	public void loginButton() {
		driver.findElement(login_Button).click();
	}
}
