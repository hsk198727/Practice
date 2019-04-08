package practice1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Practice_day_1 
	
{
	WebDriver driver;
	String URL="https://www.facebook.com/";
  @Test
  public void TC001() 
  {
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver=new ChromeDriver();
	  driver.get(URL);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
	  driver.close();
  }

}
