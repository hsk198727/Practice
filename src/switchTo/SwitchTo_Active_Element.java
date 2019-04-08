package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Active_Element
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		//Identify Element 1
		WebElement Wrk_Exp=driver.findElement(By.id("cjaExp"));
		Wrk_Exp.click();
		
		//Switch To Active Element
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN, 
				Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(4000);
		
		//Identify Element 2
		WebElement Exp_Sal=driver.findElement(By.id("cjaMinSal"));
		Exp_Sal.click();
		
		//Switch to Active Element
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		
		//Identify Element 3
		WebElement Ind=driver.findElement(By.id("cjaInd"));
		Ind.click();
		Thread.sleep(4000);
		
		//Switch To Active Element 3
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN, Keys.ENTER, 
		Keys.ARROW_DOWN, Keys.ENTER, Keys.ARROW_DOWN, Keys.ENTER, Keys.ARROW_DOWN,
		Keys.ENTER, Keys.ARROW_DOWN, Keys.ENTER);
		
			}

}
