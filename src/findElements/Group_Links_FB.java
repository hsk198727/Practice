package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links_FB {

	public static void main(String[] args) throws Exception 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement>List;
		WebElement Links;
		//Target single Element
		Links=driver.findElement(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']"));
		
			//Target all links
		List=Links.findElements(By.tagName("a"));
		
		int List_size=List.size();
		
		System.out.println(List_size);
		
//		
//		
//		for (int i = 0; i < List_size; i++) 
//		{	
//			WebElement EachLink=List.get(i);
//			
//			String Link_Name=EachLink.getText().trim();
//			
//			String Link_Href=EachLink.getAttribute("href");
//			
//			System.out.println(Link_Name+"             "+Link_Href);
//			
//			EachLink.click();
//			
//			Thread.sleep(3000);
//			
//			driver.navigate().back();
//			
//			Links=driver.findElement(By.xpath("//div[@aria-label='Facebook site links']"));
//			
//			//Target all links
//			List=Links.findElements(By.tagName("a"));
//			
//			
			
			
			
		}
		
	}

//}
