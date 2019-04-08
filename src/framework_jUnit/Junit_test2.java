package framework_jUnit;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_test2 
	

{
	static WebDriver driver;
	static String url="http://gmail.com";
	
	@Test
	public void verify_logIn_valid() throws Exception
	{
		
		WebElement email_id=driver.findElement(By.xpath("//input[contains(@id,'identifierId')]"));
		email_id.clear();
		email_id.sendKeys("hsk198727");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][contains(.,'Next')]")).click();
		Thread.sleep(5000);
		
		WebElement pswd=driver.findElement(By.xpath("//input[@type='password']"));
		pswd.clear();
		pswd.sendKeys("privatedatas@12");
		
		driver.findElement(By.xpath("//content[contains(.,'Next')]")).click();
		
		
		String Exp_title="Gmail";
		
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Test1 passed - Title Verfified after login");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@BeforeClass
	public static void setUpBefore()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public static void setUpAfter() throws Exception
	{
		Thread.sleep(10000);
		driver.close();
	}

}
