package mouse_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_and_Keydown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		WebElement Frame1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Frame1);
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).perform();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ol[@id='selectable']/li[1]")).click();		
		driver.findElement(By.xpath("//ol[@id='selectable']/li[3]")).click();
		driver.findElement(By.xpath("//ol[@id='selectable']/li[7]")).click();
		driver.findElement(By.xpath("//ol[@id='selectable']/li[6]")).click();
		
		Thread.sleep(3000);
		action.keyUp(Keys.CONTROL).perform();
		driver.findElement(By.xpath("//ol[@id='selectable']/li[7]")).click();
		driver.findElement(By.xpath("//ol[@id='selectable']/li[6]")).click();
		
				
	}

}
