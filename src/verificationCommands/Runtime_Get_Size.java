package verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Get_Size
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver= new ChromeDriver();
		String url="https://www.paytm.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		//find location of an object-"Download App"
		WebElement Object= driver.findElement(By.linkText("CableTv"));
		Dimension Object1=Object.getSize();
		int obj_h=Object1.getHeight();
		int obj_w=Object1.getWidth();
		System.out.println("Object height is--> "+obj_h);
		System.out.println("Object width is --> "+obj_w);
		Thread.sleep(1000);
//		Object.click();
		//find location of an object - Search Bar
//		WebElement Object2=driver.findElement(By.xpath("//input[@placeholder='Search for a Product , Brand or Category']"));
//		Dimension Object2a=Object2.getSize();
//		int obj1_h=Object2a.getHeight();
//		int obj1_w=Object2a.getWidth();
//		System.out.println("Object2 height is --> "+obj1_h);
//		System.out.println("Object2 width is --> "+obj1_w);
//		Object2.clear();
//		Object2.sendKeys("Flights",Keys.ENTER);
//		
//		
		
		
				
		
	
		
		

	}

}
