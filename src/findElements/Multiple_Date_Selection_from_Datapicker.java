package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Date_Selection_from_Datapicker 
{

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Identify date picker
		WebElement dp_date=driver.findElement(By.name("depart_date"));
		dp_date.click();
		
		for (int i = 0; i <= 3; i++) 
		{
			//Target current month table
			WebElement active_month;
			active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			//Identify all active links
			List<WebElement>active_dates;
			active_dates=active_month.findElements(By.tagName("a"));
						
			//Iterate for active dates
			for (int j = 0; j < active_dates.size(); j++) 
				
			{
				WebElement eachDate=active_dates.get(j);
				eachDate.click();
				
				//Open Calender
				dp_date.click();
				
				//Restore all active dates for current month
				active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				active_dates=active_month.findElements(By.tagName("a"));
			}
			
			//Identify Next button
			driver.findElement(By.xpath("//a[@id='cal_showNextMonth']")).click();
			Thread.sleep(2000);
		
			
		}
		
	}

}
