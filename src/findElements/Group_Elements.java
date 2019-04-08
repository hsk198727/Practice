package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Elements 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Locate single Element
		WebElement Month=driver.findElement(By.id("month"));
		
		//Locate Group Elements under single Element
		List<WebElement>all_options=Month.findElements(By.tagName("option"));
		int list_size=all_options.size();
//		System.out.println(list_size);
//		WebElement single=all_options.get(5);
//		single.click();
		
		for (int i = 0; i < list_size; i++) 
		{
			WebElement Each_option=all_options.get(i);
			Each_option.click();
			
		}
		
		
	}

}
