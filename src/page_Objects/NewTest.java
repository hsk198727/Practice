package page_Objects;
import libs.Utility;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class NewTest 
{
	static WebDriver driver;
	static String URl="http://outlook.com";
	static Outlook_Signin SiginIn;
	String screenshotname;
	String Exp_Domain_errText="That Microsoft account doesn't exist. Enter a different account or get a new one.";
	
  @Test
  public void Invalid() throws InterruptedException
  {
	  SiginIn.Email_EB.clear();
	  SiginIn.Email_EB.sendKeys("hsk198727@yahoo.com");
	  
	  SiginIn.Email_next_btn.click();
	  Thread.sleep(5000);
	  
	  String Act_err=SiginIn.Error_Msg.getText();
	  Assert.assertEquals(Exp_Domain_errText, Act_err);
	  System.out.println("Test Passed - Error Message displayed at WebPage");	  	    
  }
  
  @Test
  public void Valid()
  {
	  SiginIn.Email_EB.clear();
	  SiginIn.Email_EB.sendKeys("sunilreddy.gajjala@outlook.com");	  
	  SiginIn.Email_next_btn.click();
	  
	  System.out.println("Test2 Passed - Error Message not displayed, as entered Valid Credentials");
  }
  
  @Before
  public void pre_conditions()
  {
	  driver.get(URl);
	  SiginIn.Signin_btn.click();
  }  
  
  @BeforeClass
  public static void beforeClass() 
  
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  SiginIn = new Outlook_Signin(driver);   
	  
	  	  
  }
  
  @After
  public void captureScreenShot() throws IOException
  
  {
	  
	  Utility.captureScreenShot(driver, "All ScreenShots");
	 
	  
	  
  }

  @AfterClass
  public static void afterClass() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
