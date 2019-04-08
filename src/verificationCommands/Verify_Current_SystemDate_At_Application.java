package verificationCommands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Current_SystemDate_At_Application 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement Dep_date=driver.findElement(By.id("hp-widget__depart"));
		String D_date=Dep_date.getAttribute("value");
		System.out.println(D_date);
		
		
		Date SD= new Date();
//		System.out.println("Today's date is --> "+SD)
//		SimpleDateFormat sdf=new SimpleDateFormat("dd MMM, EEE");
        SimpleDateFormat sdf= new SimpleDateFormat("dd MMM, EEE");
		String Sdate=sdf.format(SD);
		System.out.println(Sdate);
		
		if (D_date.equals(Sdate))
		{
			System.out.println("Date Matches");
		} else 
		{
			System.out.println("Date MisMatch");
		}
		
		
		

	}

}
