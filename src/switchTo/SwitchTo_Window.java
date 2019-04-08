package switchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
//		Set MainWindow handle to a string
		String mainWindowID=driver.getWindowHandle();
		System.out.println(mainWindowID);
		
		//Click a link on the mainPage
		WebElement Insta_link=driver.findElement(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li[15]"));
		Insta_link.click();
		
		//Get All Window Handles
		Set<String> AllWindowIdS=driver.getWindowHandles();
		
		for (String EachWindowID : AllWindowIdS)
		{
			driver.switchTo().window(EachWindowID);
			Thread.sleep(3000);
			driver.switchTo().window(mainWindowID);
			
		}	
			
		

	}

}
