package datadriven_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;


public class Read_MultipleRow_Using_Conditions 
{
	String filePath="D:\\Selenium\\Projects\\SELENIUM\\src\\datadriven_framework\\";
	String fileName="InputData.xlsx";
	WebDriver driver;
	String SheetName="Sheet4";
	XSSFWorkbook book;
	XSSFSheet sht;
	XSSFRow row;
	FileInputStream fi;
	
  @Test
  public void Test1() 
  {
	  //Get number of Rows available on the targeted sheet
	  	int Row_Count=sht.getLastRowNum();
	  	System.out.println("Number of rows present on the targeted sheet are ==>> "+Row_Count);
	  	
	  	//Iterate number of rows
	  	for (int i = 5; i <Row_Count; i++) 
	  	{
	  		//Target dynamic rows
	  		row=sht.getRow(i);
	  		
	  		//get execution status
	  		String Ext_Status=row.getCell(2).getStringCellValue();
	  		
	  		if (Ext_Status.equals("Y")) 
	  		{
	  			String UID=row.getCell(0).getStringCellValue();
				String PWD=row.getCell(1).getStringCellValue();
				
				System.out.println("Targted Username Details are "+UID+"  "+PWD);
				
				//Get Scenario Type
				String Scenario=row.getCell(3).getStringCellValue();
				
				//Accept Conditions
				if(Scenario.equals("visible"))
				{
					System.out.println("Element visible for => "+UID);
				}
				else if (Scenario.equals("p")) 
				{
					System.out.println("positive output for => "+UID);
				}
				else if (Scenario.equals("n")) 
				{
					System.out.println("negative output for => "+UID);
					
				}
				else if (Scenario.equals("alert")) 
				{
					System.out.println("Alert is present for =>"+UID);
				}
				else if (Scenario.equals("text")) 
				{
					System.out.println("Text output for =>"+UID);
				}
				else
				{
					System.out.println("No Scenario matches for => "+UID);
				}
			}
	  		
			
		}
	  
	  
  }

  
  @BeforeMethod
  public void beforeMethod() throws IOException 
  {
	fi=new FileInputStream(filePath+fileName);
	book=new XSSFWorkbook(fi);
	sht=book.getSheet(SheetName);
	
	
  }

  @AfterMethod
  public void afterMethod() throws Exception 
  {
	  Thread.sleep(5000);
	  book.close();  //Save Data
  }
  

}
