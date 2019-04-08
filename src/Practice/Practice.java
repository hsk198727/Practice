package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) 
		{
		WebDriver driver=new ChromeDriver();	
		driver.get("https://phptravels.com/404/");
		driver.manage().window().maximize();
//		driver.findElement(By.linkText("More")).click();
//		driver.findElement(By.xpath("//a[contains(., 'Demo')]")).click();
//		driver.findElement(By.xpath("//a[contains(., 'Pricing')]")).click();
		driver.findElement(By.linkText("Features")).click();
		
		
		
	}

}
