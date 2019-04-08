package framework_jUnit;
import org.testng.annotations.Test;
import libs.Utility;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class GoogleTest 
{
	WebDriver driver;
  @Test
  public void TitleTest() 
  {
	  String title=driver.getTitle();
	  System.out.println(title);
  }
  
  @Test
  public void googleLogoTest() 
  {
	  boolean b=driver.findElement(By.xpath("//img[contains(@id,'hplogo')]")).isDisplayed();
	  Assert.assertEquals(b, true);
	 
	  
  }
  
  @BeforeMethod
  public void SetUp() 
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.google.com/");
	  
  }

  @AfterMethod
  public void tearDown(ITestResult result) throws Exception 
  {
	  if(ITestResult.FAILURE==result.getStatus())
	  {
	  Utility.captureScreenShot(driver, result.getName());
	  }
	  else 
	  {
		  Utility.captureScreenShot(driver, result.getName());
		  	  
	  }
	  driver.quit();
	  
	  
  }

}
