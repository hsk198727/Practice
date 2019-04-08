package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {
  @Test
  public void ddvalue() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  String URL="https://www.makemytrip.com/";
	  driver.get(URL);
	  driver.manage().window().maximize();
	  
	  WebElement f_dd=driver.findElement(By.id("hp-widget__sfrom"));
	  f_dd.clear();
	  f_dd.sendKeys("Hyderabad");
	  f_dd.click();
	  WebElement t_dd=driver.findElement(By.id("hp-widget__sTo"));
	  t_dd.clear();
	  t_dd.sendKeys("Goa");
	  Thread.sleep(2000);
	  t_dd.sendKeys(Keys.ENTER);
	  
	  driver.findElement(By.xpath("//a[@data-event='click']")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.linkText("29")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.id("hp-widget__return")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.linkText("28")).click();
	  driver.findElement(By.id("hp-widget__paxCounter_pot")).click();
	  driver.findElement(By.xpath("//*[@id=\"js-adult_counter\"]/li[4]")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//*[@id='js-child_counter']/li[2]")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//*[@id='js-infant_counter']/li[2]")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.linkText("Done")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.id("searchBtn")).click();
	  
	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
