package datadriven_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

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
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Read_TestCase_From_Excel 
{
	String Filepath="D:\\Selenium\\Projects\\SELENIUM\\src\\datadriven_framework\\";
	FileInputStream fi;
	WebDriver driver;
	String filename="InputData.xlsx";
	XSSFWorkbook book;
	String sheetname="Sheet2";	
	XSSFSheet sht;
	XSSFRow row;
	String Exp_Error="That Microsoft account doesn’t exist. Enter a different account or get a new one.";
	
  @Test
  public void Tc001_Email_Validation_With_ValidData() throws Exception 
  {
	  
	  	String Appurl=row.getCell(1).getStringCellValue();
	  	driver.get(Appurl);
	  	
	  	
	  	//Target xpath for SignIn Btn and click
	  	String Signin_btn_Locator=row.getCell(2).getStringCellValue();
	  	driver.findElement(By.xpath(Signin_btn_Locator)).click();
	  	
	  	//Target Username xpath and EB
	  	String Email_locator=row.getCell(3).getStringCellValue();
	  	String Email_input=row.getCell(4).getStringCellValue();
	  	
	  	driver.findElement(By.xpath(Email_locator)).clear();
	  	driver.findElement(By.xpath(Email_locator)).sendKeys(Email_input);
	  	
	  	//Target Next btn after entering Email ID
	  	String NextBtn_Locator=row.getCell(5).getStringCellValue();
	  	driver.findElement(By.xpath(NextBtn_Locator)).click();
	  	
	  	//Target Pswd Location and EB
	  	String Pswd_locator=row.getCell(6).getStringCellValue();
	  	String Pswd_input=row.getCell(7).getStringCellValue();
	  	driver.findElement(By.xpath(Pswd_locator)).clear();
	  	driver.findElement(By.xpath(Pswd_locator)).sendKeys(Pswd_input);
	  	
	  	//Target Next btn after entereing Paswd
	  	String Pwsd_Next_Btn=row.getCell(8).getStringCellValue();
	  	driver.findElement(By.xpath(Pwsd_Next_Btn)).click();
	  	
	  	Thread.sleep(5000);
	  	
  }
	  	
	  	  
  
  @BeforeClass
  public void SetupBrowserlaunch() throws IOException
  
  {
	  //Initiate Book
	  
	  	fi=new FileInputStream(Filepath+"InputData.xlsx");
	  	book=new XSSFWorkbook(fi);
	  	sht=book.getSheet(sheetname);
	  	row=sht.getRow(1);
	  	
	  
	  //Initiate browser
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  
	  
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
