package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Browser_navigationCommand 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
		
		//Identify Signin button
		//WebElement Signin_btn=driver.findElement(By.xpath("//button[@class='login-btn']"));
		//Signin_btn.click();
		
		//Navigate To Frame
		driver.navigate().to("https://www.redbus.in/account?pageName=Hotels");
		
		//Enter value in Mobile field in the Frame
		WebElement Mobile_Num=driver.findElement(By.id("mobileNoInp"));
		Mobile_Num.clear();
		Mobile_Num.sendKeys("9966666528");
		Thread.sleep(5000);
		
		//Navigate back to Default Page
		driver.navigate().back();
		
		
		//Click on Element on Default Page
		driver.findElement(By.xpath("//nav[@class='product-nav']/ul/li[3]")).click();
		
		
		
	}

}
