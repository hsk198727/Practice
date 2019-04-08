package testNG_frameWork;
import org.testng.annotations.Test;
import libs.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Before_class_And_AfterClass {
	WebDriver driver;
	
  @Test(priority=3)
  public void TC1() 
  {
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).clear();
	  driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).sendKeys("Sandeep Kumar");
	  Reporter.log("Test1 Executed");
	  System.out.println("TC1 Executed");
  }
  @Test(priority=2)
  public void TC2() 
  {
	  driver.get("https://www.google.com/");
	  driver.findElement(By.xpath("//input[@type='text']")).clear();
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple");
	  driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).sendKeys(Keys.ENTER);
	  Reporter.log("Test2 Executed");
	  System.out.println("TC2 Executed");
  }
  @Test(priority=1)
  public void TC3() throws InterruptedException 
  {
	  driver.get("https://www.yahoo.com/");
	  driver.findElement(By.xpath("//input[contains(@id,'uh-search-box')]")).clear();
	  driver.findElement(By.xpath("//input[contains(@id,'uh-search-box')]")).sendKeys("Barcelona");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[contains(@id,'uh-search-box')]")).sendKeys(Keys.ENTER);
	  Reporter.log("Test3 Executed");
	  System.out.println("TC2 Executed");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Before Method Executed");
  }
  
  @AfterMethod
  public void  screenCapture(ITestResult result) throws Exception
  {
	  Utility.captureScreenShot(driver, result.getName());
	  System.out.println("screenCapture");
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Browser Intiated");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	  
	  
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  System.out.println("Broswer Closed");
	  Thread.sleep(5000);
	  driver.quit();
  }

}
