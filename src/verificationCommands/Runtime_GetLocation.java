package verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_GetLocation 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		String url="https://www.gmail.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement Obj1=driver.findElement(By.id("logo"));
		Point Obj2=Obj1.getLocation();
		int obj_x=Obj2.getX();
		int obj_y=Obj2.getY();
		
		System.out.println("Object-x co-ordinates is --> "+obj_x);
		System.out.println("Object-y co-ordinates is --> "+obj_y);
		
		
		
		
		
		
		

	}

}
