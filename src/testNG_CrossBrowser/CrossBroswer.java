package testNG_CrossBrowser;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class CrossBroswer 
{
	
	WebDriver driver;
	
	
  @Test(priority=1)
  @Parameters("appUrl")
  public void loadApp(String url) 
  {
	  driver.get("http://cleartrip.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Actions action=new Actions(driver);
	  action.sendKeys(Keys.ESCAPE).build().perform();
  }
  @Test(priority=2)
  public void flight_search() throws Exception
  {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[contains(@id,'FromTag')]")).clear();
	  driver.findElement(By.xpath("//input[contains(@id,'FromTag')]")).sendKeys("Hydera");
	  driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
  }
  
  @Test(priority=0)
  @Parameters("broswername")
  public void launchBrowser(String browser) 
  {
	  switch (browser) {
	case "chrome":
		driver=new ChromeDriver();
		break;
	case "firefox":
		driver=new FirefoxDriver();
		break;
	case "internetexplorer":
		driver=new InternetExplorerDriver();
		break;
		default:System.out.println("no browser found");
		break;
	}
	  	  
  }
}
