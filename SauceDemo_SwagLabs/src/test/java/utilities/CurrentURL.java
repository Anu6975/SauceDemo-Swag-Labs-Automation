package utilities;

import org.openqa.selenium.WebDriver;

public class CurrentURL {
	WebDriver driver;
	
	public CurrentURL(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
