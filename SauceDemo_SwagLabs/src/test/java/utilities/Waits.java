package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class Waits {
	
	WebDriver driver;
	
	public Waits(WebDriver driver) {
		this.driver = driver;
	}
	
	public void implicit() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

}
