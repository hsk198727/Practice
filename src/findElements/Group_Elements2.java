package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Elements2 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		
		List<WebElement>AllLinks=driver.findElements(By.tagName("a"));
		int nu_of_links=AllLinks.size();
		System.out.println(nu_of_links);
		
		for (int i = 0; i < nu_of_links; i++) 
		{
			String LinksName=AllLinks.get(i).getText();
			System.out.println(LinksName);
		}
		
		
	}

}
