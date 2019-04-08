package Practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import libs.Utility;

public class Facebook_Signup {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Utility.captureScreenShot(driver, "BrowserStarted");
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Sandeep");
		Utility.captureScreenShot(driver, "Fname");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Hanchatey");
		Utility.captureScreenShot(driver, "Lname");
		
		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys("hsk198727@gmail.com");
		Utility.captureScreenShot(driver, "Ename");
		
		driver.findElement(By.id("u_0_r")).clear();
		driver.findElement(By.id("u_0_r")).sendKeys("hsk198727@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys("Sandeep@1");
		Utility.captureScreenShot(driver, "Pname");
		
		driver.findElement(By.id("day")).sendKeys("21");
		
		driver.findElement(By.id("month")).sendKeys("May");
		
		driver.findElement(By.id("year")).sendKeys("1987");
		
		driver.findElement(By.id("u_0_a")).click();
		
		driver.findElement(By.id("u_0_11")).click();
		Utility.captureScreenShot(driver, "LastPg");
	}

}
