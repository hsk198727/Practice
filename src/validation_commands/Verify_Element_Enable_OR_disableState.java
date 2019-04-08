package validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Enable_OR_disableState 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		
		WebElement local_box=driver.findElement(By.id("customLocality"));
		
		if (!local_box.isEnabled()) 
		{
			System.out.println("Test Pass");
		} else 
		{
			System.out.println("Test fail");
		}
		WebElement cs_state = driver.findElement(By.id("customState"));
		
		
		
		
				

	}

}
