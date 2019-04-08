package framework_jUnit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import libs.Utility;

public class Junit_test1 {
	
	static WebDriver driver;
	
	@Test
	public void Verify_Signup_Link()
	{
		driver.findElement(By.xpath("//a[@href='/r.php'][contains(.,'Sign Up')]")).click();
		String Exp_title="Sign up for Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Title Verified");	
	
	}
	@Test
	public void Verify_Messenger_Link()
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		String Exp_title1="Messenger";
		Assert.assertEquals(Exp_title1, driver.getTitle());
		System.out.println("Title1 Verified");
	}
	
	@Before
	public void SetUp() throws Exception
	{
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}
	@After
	public void tearDown() throws Exception
	{
		Utility.captureScreenShot(driver, "Image1");
		
	}
	
	@BeforeClass
	public static void setupBeforeClass()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

}
