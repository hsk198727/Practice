package verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Get_Size3
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver= new ChromeDriver();
		String url="https://www.paytm.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement search_location=driver.findElement(By.className("gbIh"));
		search_location.click();
		Point location=search_location.getLocation();
		int x_value=location.getX();
		int y_value=location.getY();
		Thread.sleep(2000);
		System.out.println("X value is --> "+x_value);
		System.out.println("Y Value is --> "+y_value);
		
	
		
		
	}

}
