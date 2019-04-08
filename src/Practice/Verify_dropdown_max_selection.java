package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Verify_dropdown_max_selection 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
	
		WebElement Link1=driver.findElement(By.xpath("//div[@id='dvMainNav']/ul/li[5]"));
		Link1.click();
		
		Thread.sleep(5000);
		
		
		WebElement First_name=driver.findElement(By.xpath("//input[@id='FML_USR_FRST_NM']"));
		First_name.sendKeys("Sandeep");
		
		WebElement Last_name=driver.findElement(By.xpath("//input[@id='FML_USR_LST_NM']"));
		Last_name.sendKeys("Kumar");
		
		Select City_DD=new Select(driver.findElement(By.id("FML_USR_ADDRSS_CTY_DROP")));
		City_DD.selectByVisibleText("HYDERABAD");
		
		WebElement e_mail=driver.findElement(By.name("emailid"));
		e_mail.sendKeys("hsk198727@gmail.com");
		
		WebElement mobile_no=driver.findElement(By.name("FML_USR_MBL_NMBRS"));
		mobile_no.sendKeys("9966666528");
		
		WebElement pincode=driver.findElement(By.name("FML_USR_ZIP_CD"));
		pincode.sendKeys("500076");
		
		Select Interested=new Select(driver.findElement(By.id("FML_TYP_OF_USR")));
		Interested.selectByValue("S");
		
		
		
			
		

	}

}
