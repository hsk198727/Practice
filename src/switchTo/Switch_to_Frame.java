package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_Frame 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Javadoc")).click();
		//driver.findElement(By.xpath("//frame[@title='All Packages']"));
		
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@title='Packages']/li[1]")).click();
		
		driver.switchTo().defaultContent();	
		
		//Thread.sleep(2000);
		
		driver.switchTo().frame("packageFrame");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[contains(@href,'CommandProcessor.html')]")).click();
		driver.findElement(By.xpath("//span[text()='CommandProcessor']")).click();
//		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("HttpCommandProcessor")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Constr")).click();
		
		
		
		
		
		

	}

}
