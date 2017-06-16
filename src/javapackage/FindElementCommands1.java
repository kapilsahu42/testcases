package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FindElementCommands1 {
public static void main(String[] args) {
	// Create a new instance of the FireFox driver
	WebDriver driver = new FirefoxDriver();

	// Launch the ToolsQA WebSite
	driver.get("https://www.facebook.com/login.php");

	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// Type Name in the FirstName text box      
	driver.findElement(By.id("email")).sendKeys("9040431037"); 

	//Type LastName in the LastName text box
	driver.findElement(By.name("pass")).sendKeys("LOVEumom@123");

	// Click on the Submit button
	driver.findElement(By.id("loginbutton")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("u_0_c")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("userNavigationLabel")).click();
	driver.findElement(By.id("show_me_how_logout_1")).click();
	driver.quit();
}
}