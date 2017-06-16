package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserNavigation {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String appUrl="http://www.DemoQA.com";
		driver.navigate().to(appUrl); //navigate to command 
		driver.findElement(By.xpath(".//*[@id=’menu-item-374′]/a" )).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
	}
	
	
	

}
