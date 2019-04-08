package mouse_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_OnElement 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html#example-code-simple-context-menu");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Actions action=new Actions(driver);
				
		WebElement Element=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(Element).perform();
		Thread.sleep(3000);
		
		WebElement paste=driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[3]"));
		paste.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		

	}

}
