package datadriven_framework;
import org.testng.annotations.Test;

import libs.Utility;

import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Read_Testcase_From_MultipleRows
{
	String Filepath="D:\\Selenium\\Projects\\SELENIUM\\src\\datadriven_framework\\";
	FileInputStream fi;
	WebDriver driver;
	String filename="InputData.xlsx";
	XSSFWorkbook book;
	String sheetname="Sheet3";	
	XSSFSheet sht;
	XSSFRow row;
  @Test
  public void Tc001_ReadData_From_DynamicRows() throws Exception 
  {
	  //Count number of Rows
	  	int R_Count=sht.getLastRowNum();
	  	System.out.println(R_Count);

	  	for (int i = 5; i <= R_Count; i++) 
	  	{
	  		row=sht.getRow(i);
	  		
	  		
	  		//Get data from Dynamic row
	  		String UID=row.getCell(0).getStringCellValue();
	  		String PWD=row.getCell(1).getStringCellValue();
	  		
	  		System.out.println("User Details  ==>"+UID+"      "+PWD);
	  		
	  		//Get data from static cell
	  		String APP_Url=sht.getRow(0).getCell(1).getStringCellValue();
	  		String UName_Locator=sht.getRow(1).getCell(1).getStringCellValue();
	  		String Pswd_locator=sht.getRow(2).getCell(1).getStringCellValue();
	  		String Login_Locator=sht.getRow(3).getCell(1).getStringCellValue();
	  		
	  		//Load WebPage
	  		driver.get(APP_Url);
	  		
	  		//Find Elements and Enter Input/Click	  		
	  		WebElement User_Input=driver.findElement(By.xpath(UName_Locator));
	  		User_Input.clear();
	  		User_Input.sendKeys(UID);
	  		
	  		WebElement Pswd_Input=driver.findElement(By.xpath(Pswd_locator));
	  		Pswd_Input.clear();
	  		Pswd_Input.sendKeys(PWD);
	  		
	  		driver.findElement(By.xpath(Login_Locator)).click();
	  		
	  		Utility.captureScreenShot(driver, "img");

		}

  }
  
  
  
  
  
  
  
  
  
  
  
  
  @BeforeMethod
  public void setUp() throws IOException 
  	{
  	//Access Workbook
	  	fi=new FileInputStream(Filepath+"InputData.xlsx");
  			
  	  	book=new XSSFWorkbook(fi);
  		  	
  	  	sht=book.getSheet(sheetname);
  		  	
  //Initiate browser
  	  	driver=new ChromeDriver();
  		  
  		driver.manage().window().maximize();
  		  
  		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
  			
  		}
 @AfterMethod
 public void tearDown() throws IOException
 {
	 	
	 	driver.quit();
	 	book.close();//save data
 }
}
