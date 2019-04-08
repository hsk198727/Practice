package page_Objects;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class FB_Signup_Run 
{
	static WebDriver driver;
	static String url="http://facebook.com";
	FB_signUp_elements SignUp;
	static String screenshotname;
	
	@Test
	public void user_signup()
	{
		//Access PageFactory Class
		SignUp=PageFactory.initElements(driver, FB_signUp_elements.class);
		SignUp.FirstName_EB.clear();
		SignUp.FirstName_EB.sendKeys("Sandeep");
		
		SignUp.SurName_EB.clear();
		SignUp.SurName_EB.sendKeys("Kumar");
		
		SignUp.Mobile_EB.clear();
		SignUp.Mobile_EB.sendKeys("hsk198727@gmail.com");
		
		SignUp.Re_type_Email_EB.clear();
		SignUp.Re_type_Email_EB.sendKeys("hsk198727@gmail.com");
		
		SignUp.Password_EB.clear();
		SignUp.Password_EB.sendKeys("456789845");
		String InputData=SignUp.Password_EB.getAttribute("value");
		System.out.println(InputData);
		
		
		SignUp.Day_DD.click();
		new Select(SignUp.Day_DD).selectByValue("27");
		
		SignUp.Month_DD.click();
		new Select(SignUp.Month_DD).selectByValue("4");
		
		SignUp.Year_DD.click();
		new Select(SignUp.Year_DD).selectByVisibleText("1987");
	}
	
	
	@Test
	public void user_SignUp1()
	{
		SignUp=PageFactory.initElements(driver, FB_signUp_elements.class);
		SignUp.FirstName_EB.clear();
		SignUp.FirstName_EB.sendKeys("Priyanka");
		
		SignUp.SurName_EB.clear();
		SignUp.SurName_EB.sendKeys("Hanchatey Kamble");
		
		SignUp.Mobile_EB.clear();
		SignUp.Mobile_EB.sendKeys("priyankak40@gmail.com");
		
		SignUp.Re_type_Email_EB.clear();
		SignUp.Re_type_Email_EB.sendKeys("priyankak40@gmail.com");
		
		SignUp.Password_EB.clear();
		SignUp.Password_EB.sendKeys("84566546546");
		String Input_Data1=SignUp.Password_EB.getAttribute("value");
		System.out.println(Input_Data1);
		
		
		SignUp.Day_DD.click();
		new Select(SignUp.Day_DD).selectByValue("17");
		
		SignUp.Month_DD.click();
		new Select(SignUp.Month_DD).selectByVisibleText("Sept");
		
		SignUp.Year_DD.click();
		new Select(SignUp.Year_DD).selectByVisibleText("1995");		
		
	}
	
	@AfterClass
	public static void captureScreenShot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("D:\\ScreenShots\\New\\"+screenshotname+".png"));
		
		System.out.println("ScreenShotTaken");
		
				
		
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
		Thread.sleep(10000);
		driver.close();
	}
	

}
