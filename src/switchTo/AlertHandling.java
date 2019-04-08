package switchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='yellow_band']/a[2]")).click();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
				
		Alert alert=driver.switchTo().alert();
		String alert_msg=alert.getText();
		System.out.println("==> "+alert_msg);
		Thread.sleep(4000);
		alert.accept();
		

	}

}
