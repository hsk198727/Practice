package global_Variables;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Helper 
{
	
	String url;
	String F_Name;
	String S_Name;
	String E_mail;
	String pswd;
	WebDriver driver;
	String Day_DD;
	String Month_DD;
	String Year_DD;
	
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	}
	
	public void New_Registration()
	{
		driver.findElement(Locators.First_name).clear();
		driver.findElement(Locators.First_name).sendKeys(F_Name);
		
		driver.findElement(Locators.Surname).clear();
		driver.findElement(Locators.Surname).sendKeys(S_Name);
		
		driver.findElement(Locators.Email).clear();
		driver.findElement(Locators.Email).sendKeys(E_mail);
		
		driver.findElement(Locators.Re_Enter_Email).clear();
		driver.findElement(Locators.Re_Enter_Email).sendKeys(E_mail);
		
		driver.findElement(Locators.New_Pswd).clear();
		driver.findElement(Locators.New_Pswd).sendKeys(pswd);
		
//		new Select(driver.findElement(By.id("customState"))).selectByVisibleText("Telangana");
		new Select(driver.findElement(Locators.Day_DD1)).selectByVisibleText(Day_DD);
		
		new Select(driver.findElement(Locators.Month_DD1)).selectByVisibleText(Month_DD);
		
		new Select(driver.findElement(Locators.Year_DD1)).selectByVisibleText(Year_DD);
		
	}
	
	public void CLICK()
	{
		driver.findElement(Locators.Rnd_btn).click();
		
		driver.findElement(Locators.Sigin_btn).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	


