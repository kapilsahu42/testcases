package javapackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Gecko_Driver {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\geckodriver.exe");
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability("marionette", true);
	WebDriver driver = new FirefoxDriver(capabilities);
	driver.get("http://www.toolsqa.com");

	Thread.sleep(5000);
	driver.quit();
}
}