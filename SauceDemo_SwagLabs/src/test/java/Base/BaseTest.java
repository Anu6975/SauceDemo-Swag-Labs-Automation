package Base;

import java.util.Map;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class BaseTest {
	
	public WebDriver driver;
	public static String username = "standard_user";
	public static String password = "secret_sauce";
	
	@BeforeClass
	public void setup() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-features=PasswordLeakDetection");
		options.setExperimentalOption("prefs", Map.of( "credentials_enable_service", false,
                    "profile.password_manager_enabled", false, 
                    "profile.password_manager_leak_detection", false ));
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
