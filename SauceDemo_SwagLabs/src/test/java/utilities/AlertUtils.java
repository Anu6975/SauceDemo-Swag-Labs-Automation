package utilities;

import org.openqa.selenium.WebDriver;

public class AlertUtils {
	WebDriver driver;
	
	public AlertUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

}
