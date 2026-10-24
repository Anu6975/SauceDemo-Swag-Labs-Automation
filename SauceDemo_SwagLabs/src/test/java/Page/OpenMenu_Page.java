package Page;

import org.openqa.selenium.*;


public class OpenMenu_Page {
	
	WebDriver driver;
	
	public OpenMenu_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By openMenu = By.id("react-burger-menu-btn");
	By logout = By.id("logout_sidebar_link");
	
	public void openMenu() {
		driver.findElement(openMenu).click();
	}
	
	public void logout() {
		driver.findElement(logout).click();
	}

}
