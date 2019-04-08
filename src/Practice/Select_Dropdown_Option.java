package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Option {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.hdfcbank.com/branch-atm-locator");
	driver.manage().window().maximize();
//	select dropdown option using visible text(option name)
	Thread.sleep(1500);
	new Select(driver.findElement(By.id("customState"))).selectByVisibleText("Telangana");
//	select dropdown option using value(attribute)
	new Select(driver.findElement(By.id("customCity"))).selectByValue("secunderabad");
	driver.findElement(By.id("customLocality")).clear();
	driver.findElement(By.id("customLocality")).sendKeys("Marredpally");
	new Select(driver.findElement(By.name("radius"))).selectByValue("5");
	driver.findElement(By.name("cot[]")).click();
	driver.findElement(By.name("st[]")).click();
	driver.findElement(By.id("amenity_service_types66")).click();
	driver.findElement(By.id("amenity_service_types53")).click();
	driver.findElement(By.id("amenity_service_types54")).click();
	driver.findElement(By.id("amenity_service_types55")).click();
	driver.findElement(By.id("amenity_service_types56")).click();
	driver.findElement(By.id("amenity_service_types57")).click();
	Thread.sleep(1500);
	driver.findElement(By.linkText("More Details")).click();
	driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div[1]/form[2]/ul/li[7]/input")).click();
	
	
	
	
	
	
	

	}

}
