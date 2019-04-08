package java_Executor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Example1 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//Enable JS executor on Driver
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement Element=driver.findElement(By.id("u_0_l"));
		js.executeScript("arguments[0].style.outline='red solid 3px'", Element);
//		Element.clear();
//		Element.sendKeys("Sandeep Kumar");
//		js.executeScript("arguments[0].style.backgroundColor='Red'", Element);
//		Utility.captureScreenShot(driver, "image1");
//		js.executeScript("arguments[0].style.backgroundColor='Green'", Element);
//		Utility.captureScreenShot(driver, "image2");
//		js.executeScript("arguments[0].style.backgroundColor='Blue'", Element);
//		WebElement Element1=driver.findElement(By.id("u_0_l"));
		
		
//		js.executeScript("arguments[0].style.outline='red solid 2px'", Element1);
		
		
		
//		js.executeScript("document.getElementById('u_0_j').value='Sandeep Kumar Hanchatey'");
		
		
		
		

	}

}
