package SampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG 
{
	WebDriver driver;
	@Test
	public void tc001()
	{
		System.out.println("Test 1 pass");
	
	}
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
				
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		
		
	}

}
