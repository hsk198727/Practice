package verificationCommands;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class verify_runtime3
{

	public static void main(String[] args) throws InterruptedException
	{
		String url= "https://www.facebook.com/";
		WebDriver driver=new ChromeDriver();	
		driver.get(url);
		driver.manage().window().maximize();
		String pagetitle=driver.getTitle();
		System.out.println("Page Title is => "+pagetitle);
		
		
	}

}
