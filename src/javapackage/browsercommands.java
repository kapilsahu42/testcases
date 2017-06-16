package javapackage;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class browsercommands{
	
	public static void main (String[] agr) throws InterruptedException
	{
		
		File file = new File("geckdriver.exe");
		System.out.println("File.."+file.getAbsolutePath());
System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
WebDriver driver =new 	FirefoxDriver();  // INSTANCE OF FIREFOX DRIVER 

String URL = "http://www.viasat.com";
driver.get(URL);

String Title= driver.getTitle();
int titleLength= driver.getTitle().length();

System.out.println("then title of the page is :" + Title);
System.out.println("the length of the title is :" + titleLength);

String pageUrl= driver.getCurrentUrl();

if (pageUrl.equals(URL)){
	System.out.println("Verification Successful - The correct Url is opened.");
}
else{
	System.out.println("Verification Failed - An incorrect Url is opened.");
	//In case of Fail, you like to print the actual and expected URL for the record purpose
	System.out.println("Actual URL is : " + pageUrl);
	System.out.println("Expected URL is : " + URL);
    }
	
String source= driver.getPageSource();
int sourceLength= source.length();

System.out.println("length of the page source is:" + sourceLength);
Thread.sleep(10000);
driver.close();
}
}
