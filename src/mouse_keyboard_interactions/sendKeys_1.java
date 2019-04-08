package mouse_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class sendKeys_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		driver.manage().window().maximize();
		
		//Switch To Frame
		WebElement Frame1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Frame1);
		
		//Identify Element
		WebElement Option1=driver.findElement(By.xpath("//span[@class='ui-selectmenu-text']"));
						
		Actions action=new Actions(driver);
		
		action.sendKeys(Option1, Keys.chord("Faster")).build().perform();
		action.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);
		
		WebElement Option2=driver.findElement(By.xpath("//span[contains(@id,'files-button')]"));
		Option2.click();
		action.sendKeys(Option2, Keys.chord("Some unknown file")).build().perform();
		action.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
