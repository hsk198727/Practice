package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC_Credit_Card {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver.", "ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		
		
		

	}

}
