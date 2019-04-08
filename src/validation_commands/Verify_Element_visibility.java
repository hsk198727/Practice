package validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_visibility 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		WebElement One_way=driver.findElement(By.id("OneWay"));
		One_way.click();
		
		WebElement retn_dt=driver.findElement(By.id("ReturnDate"));
		
		if (!retn_dt.isDisplayed()) 
		{	
			System.out.println("As expected, return dt is hidden at webpage");
		} else 
		{
			System.out.println("Test Failed-->Return date is visible at webpage");
		}
		Thread.sleep(4000);
		WebElement Rnd_trip=driver.findElement(By.id("RoundTrip"));
		Rnd_trip.click();
		
		if (retn_dt.isDisplayed())
		{
			System.out.println("As epected, retn date is visible on selection of RoundTrip");
		} else 
		{
			System.out.println("Test Failed--> Return date is not visible at after selection of RoundTrip");
		}
		
		Thread.sleep(4000);
		WebElement multi_city=driver.findElement(By.id("MultiCity"));
		multi_city.click();
		
		WebElement totag1=driver.findElement(By.id("ToTag1"));
		if (!totag1.isDisplayed())
		{	
			System.out.println("Test1 is a pass");
		} else 
		{
			System.out.println("Test1 is a fail");
		}
		WebElement dp_dt1=driver.findElement(By.id("DepartDate1"));
		if (!dp_dt1.isDisplayed())
		{
			System.out.println("Test2 is a pass");
		} else 
		{
			System.out.println("Test2 is a fail");
		}
		WebElement fr_tag2=driver.findElement(By.id("FromTag2"));
		if (!fr_tag2.isDisplayed())
		{
			System.out.println("Test3 is a pass");
		} else 
		{
			System.out.println("Test3 is a fail");
		}
		WebElement totag2=driver.findElement(By.id("ToTag2"));
		if (!totag2.isDisplayed())
		{
			System.out.println("Test4 is a pass");
		} else 
		{
			System.out.println("Test4 is a fail");
		}
		WebElement dp_dt2=driver.findElement(By.id("DepartDate2"));
		if (!dp_dt2.isDisplayed()) 
		{
			System.out.println("Test5 is a pass");
		} else 
		{
			System.out.println("Test5 is a fail");
		}
		WebElement fr_tag3=driver.findElement(By.id("FromTag3"));
		if (!fr_tag3.isDisplayed())
		{
			System.out.println("Test6 is a pass");
		} else 
		{
			System.out.println("Test6 is a fail");
		}
		WebElement totag3=driver.findElement(By.id("ToTag3"));
		if (!totag3.isDisplayed())
		{
			System.out.println("Test7 is a pass");
		} else 
		{
			System.out.println("Test7 is a fail");
		}
		WebElement dp_dt3=driver.findElement(By.id("DepartDate3"));
		if (!dp_dt3.isDisplayed()) 
		{
			System.out.println("Test8 is a pass");
		} else 
		{
			System.out.println("Test8 is a fail");
		}
				
		
		
		
		
		
		
	}

}
