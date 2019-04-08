package verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Get_Size2
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver= new ChromeDriver();
		String url="https://www.paytm.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement Search_bar=driver.findElement(By.xpath("//input[@placeholder='Search for a Product , Brand or Category']"));
		Search_bar.clear();
		Search_bar.sendKeys("Flights",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='roundTrip']")).click();
		WebElement dep_state=driver.findElement(By.id("text-box"));
		dep_state.sendKeys("Hyderabad", Keys.TAB);
		WebElement arr_state=driver.findElement(By.id("text-box"));
		arr_state.clear();
		arr_state.sendKeys("Delhi" ,Keys.TAB);
		
		
		
				
		
		
		

	}

}
