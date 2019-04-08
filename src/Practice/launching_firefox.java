package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launching_firefox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.google.com/");
//		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.close();
		
				

	}

}
