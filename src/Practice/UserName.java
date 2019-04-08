package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UserName 
{
	public void driver()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.google.com/");
		driver.manage().window().maximize();
		driver.close();
	}
	
	public void method()
	{
		WebDriver driver2=new InternetExplorerDriver();
		driver2.get("https://www.facebook.com/");
//		driver2.manage().window().maximize();
		driver2.close();
	}
	
	}
	
