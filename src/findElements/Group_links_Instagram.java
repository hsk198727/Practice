package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links_Instagram 
{

	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	//Identify Element
	WebElement links;
	links=driver.findElement(By.xpath("//ul[@class='ixdEe']"));
	List<WebElement>all_links;
	all_links=links.findElements(By.tagName("a"));
	
	all_links.size();
	
	for (int i = 0; i < all_links.size(); i++) 
	{
			WebElement EachLink=all_links.get(i);
			
			String linkname=EachLink.getText().trim();
			
			String linkhref=EachLink.getAttribute("href").trim();
			
			System.out.println(linkname+"     "+linkhref);
			
			EachLink.click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			//restore all links
			links=driver.findElement(By.xpath("//ul[@class='ixdEe']"));
			all_links=links.findElements(By.tagName("a"));
			
			
			
			
	}
	
	
	
	
	
	
	
	
	
	

	}

}
