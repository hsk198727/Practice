package verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Runtime_UserInput_From_Editbox 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		String url=("http://www.gmail.com");
		driver.get(url);
		driver.manage().window().maximize();
		WebElement Username=driver.findElement(By.id("identifierId"));
		Username.clear();
		Username.sendKeys("mindurballs27@gmail.com", Keys.ENTER);
		String Runtime1=Username.getAttribute("value");
		Thread.sleep(2000);
		System.out.println("Username entered is --> "+ Runtime1);
		WebElement pswd=driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
		pswd.clear();
		pswd.sendKeys("fodhgogog");
		String Runtime2=pswd.getAttribute("value");
		Thread.sleep(2000);
		System.out.println("Password entered is --> "+ Runtime2);
		
		
		
		
		
	}
}

