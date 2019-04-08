package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/a")).click();
//		driver.findElement(By.xpath("//a[contains(.,'free sign up')]")).click();
//		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
//		driver.findElement(By.name("email")).sendKeys("hsk198727@gmail.com");
////	driver.findElement(By.id("countryValue")).sendKeys("India");
////	new Select(driver.findElement(By.id("countryValue"))).selectByVisibleText("India (+91)");
//		driver.findElement(By.xpath("//input[@class='search']")).sendKeys("India");
//		driver.findElement(By.name("phone")).sendKeys("9966666528");
//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hp-widget__sfrom")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Mumbai, India')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("hp-widget__sTo")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Bangkok, Thailand')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@fare-date='1550341800000']")).click();
		
		

		
		
		
		
		
		

	}

}
