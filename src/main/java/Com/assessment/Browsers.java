package Com.assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static WebDriver driver;
	
	public static WebDriver launchbrower() {
	
	if(Constants.Browser.equals("Chrome")) {
	System.setProperty("Webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	}
	else if(Constants.Browser.equals("Edge")) {
		System.setProperty("Webdriver.Edge.driver","");
		 driver = new EdgeDriver();
	}
	else if(Constants.Browser.equals("FireFox")) {
		System.setProperty("Webdriver.gecko.driver","");
		 driver = new FirefoxDriver();
	}
	return driver;
	}
}
