package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Facebook_Browser {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		//to launch FB main page
		driver.get("http://facebook.com");
		// to maximise the window
		driver.manage().window().maximize();
//		//to enter email id
//		driver.findElements(By.id("email")).clear();
//		driver.findElement(By.id("email")).sendKeys("mindurballs27@gmail.com");
//		//to enter password
//		driver.findElement(By.id("pass")).sendKeys("privatedatas@12");
//		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
//		//to hit login button
////		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
//		//to search on Facebook
//		driver.findElement(By.xpath("//input[@name='email']")).clear();
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hsk198727@gmail.com");
//		driver.findElement(By.xpath("//input[@name='pass']")).clear();
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456789");
//		driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();
		
		//Signup
//		driver.findElement(By.xpath("//input[@aria-label='First name']")).clear();
//		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Sandeep Kumar");
//		driver.findElement(By.xpath("//input[@aria-label='Surname']")).clear();
//		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Hanchatey");
//		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')][@type='submit']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Profiles')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'People')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten account')]")).click();
		
		
	}

}
