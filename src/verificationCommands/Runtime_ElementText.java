package verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_ElementText 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		String url=("http://www.gmail.com");
		driver.get(url);
		driver.manage().window().maximize();
		WebElement Sign_In_email= driver.findElement(By.id("identifierId"));
		Sign_In_email.clear();
		Sign_In_email.sendKeys("hsk198727",Keys.ENTER);
		Thread.sleep(3000);
//		WebElement Error_location=driver.findElement(By.className("GQ8Pzc"));
//		//Capture text from location at runtime
//		String Error_text=Error_location.getText();
//		String Exp_text="Couldn't find your Google Account";
//			if(Error_text.equals(Exp_text))
//				{
//				System.out.println("Expected error msg displayed on invalid domain");
//				}
//			else
//				{System.out.println("Testfail expected error msg not displayed");
//				}		
//		Scne 2
		WebElement pswd=driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
		pswd.sendKeys("dsfskdfbsdj", Keys.ENTER);
		Thread.sleep(2000);
		WebElement error_location2=driver.findElement(By.className("GQ8Pzc"));
		String error_text2=error_location2.getText();
		String exp_message2="Wrong password. Try again or click Forgot password to reset it.";
		if (error_text2.equals(exp_message2))
		{
			System.out.println("Expected Error Message in Password Field");
			
		} else 
		{
			System.out.println("Error Message not displayed");

		}
		
		
		
		
		
		
	}
	}





