package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest
{
  @Test
  public void f() 
    {
	  WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		//Select dropdown option using Keyboard shortcuts
		driver.findElement(By.id("day")).sendKeys("abc");
		
		//Select dropdown option using Keyboard shortcuts
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		//Select dropdown option using keyboard shortcuts
		driver.findElement(By.id("year")).sendKeys("2012");
	  
  }
}
