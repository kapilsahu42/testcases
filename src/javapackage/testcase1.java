package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

       static WebDriver driver;
       
       public static void beforemethof(){
             
              System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
             //DesiredCapabilities capabilities = DesiredCapabilities.chrome();
             //ChromeOptions options = new ChromeOptions();
             /*options.addArguments("test-type");
             options.addArguments("--start-maximized");
             options.addArguments("incognito");
       */       /*capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
              capabilities.setCapability(ChromeOptions.CAPABILITY, options);
       */     
             driver = new ChromeDriver();
             //driver=new FirefoxDriver();
       }
       
       public static void main(String a[]) throws InterruptedException
       {
             beforemethof();
             driver.get("http://uat-myexede.cs32.force.com/");
              driver.findElement(By.id("IDToken1")).sendKeys("newuser1f51f");
              driver.findElement(By.id("IDToken2")).sendKeys("Password1");
             driver.findElement(By.id("Login.Submit")).click()       ;
             Thread.sleep(100);
             driver.findElement(By.xpath("/html/body/span[3]/div/div/span[1]/span/form/nav/div/div/div/ul[1]/li[3]/ul/li[1]/a")).click();
             /* if(driver.findElement(By.id("Dashboard")).isDisplayed()){
                    System.out.println("test case passed");
                    
             }
             else{
                    System.out.println("test case failed");
             
             }*/
             
         driver.close();   		  
}
}

