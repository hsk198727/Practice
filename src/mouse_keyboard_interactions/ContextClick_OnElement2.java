package mouse_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_OnElement2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		WebElement e_mail=driver.findElement(By.id("email"));
//		action.contextClick(e_mail).perform();	
		
		WebElement LogIN=driver.findElement(By.xpath("//input[contains(@data-testid,'royal_login_button')]"));
		
		action.click(LogIN).build().perform();
		
		

		
		
		
		
	}

}
