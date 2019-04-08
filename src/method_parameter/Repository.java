package method_parameter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 

{
	WebDriver driver;
	WebDriverWait wait;

	
	public void launchBrowser(String browserName)
	{
		switch (browserName) 
		{
		case "chrome":
		driver=new ChromeDriver();
		break;
		
		case "firefox":
		driver=new FirefoxDriver();	
		break;	
		
		case "InternetExplorer":
		driver=new InternetExplorerDriver();
		break;	
		
		default:
		break;
		}
		}
	public void loadPage(String URL)
	{
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	public void waitCommands(int time_in_seconds)
	{
		driver.manage().timeouts().implicitlyWait(time_in_seconds, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, time_in_seconds);
	}
	
	public void tearDown(int time) throws Exception
	{
		 Thread.sleep(time);
		 driver.close();
	}
	
	public void EnterName(By locator, String Data)
	{
		WebElement Editbox=driver.findElement(locator);
		Editbox.clear();
		Editbox.sendKeys(Data);
		
	}
	public void EnterName(String XPATH, String Data)
	{
		WebElement Xpath=driver.findElement(By.xpath(XPATH));
		Xpath.clear();
		Xpath.sendKeys(Data);
		
	}
	public void captureScreenShot(String Imagename)  throws IOException
	{
		Date d=new Date();
		//Create simple date foramatter
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/hh-mm-ss");
		//using simpel date foramt convert date
		String time=sdf.format(d);
				
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("D:\\Selenium\\Projects\\SELENIUM\\Screens\\"+time+Imagename+".png"));
		
				
		
	}

}
