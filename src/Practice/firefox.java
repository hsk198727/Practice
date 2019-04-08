package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.google.com/");
//		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.close();
		
				


	}

}
