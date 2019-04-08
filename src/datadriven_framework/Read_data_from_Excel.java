package datadriven_framework;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Read_data_from_Excel 
{
  @Test
  public void Access_Data_From_Targetted_Cell() throws IOException 
  {
	  //Target File path
	  String FilePath="D:\\Selenium\\Projects\\SELENIUM\\src\\datadriven_framework\\";
	  
	  //Target file location
	  	FileInputStream fi=new FileInputStream(FilePath+"InputData.xlsx");
	  	System.out.println("File Located");
	  	
	  	//Access Workbook
	  	XSSFWorkbook book=new XSSFWorkbook(fi);
	  	
	  	//Target Sheet using SheetName
	  	
	  	XSSFSheet sht= book.getSheet("Sheet1");
	  	
	  	//Target Row using "sht" referral
	  	
	  	XSSFRow row=sht.getRow(1);
	  	
	  	//Target Cell Using "row" referall
	  	
	  	XSSFCell cell=row.getCell(0);
	  	
	  	//Get Vallue from selected cell
	  	
	  	String Appurl=cell.getStringCellValue();
	  	
	  	System.out.println("URL Address is ==> "+Appurl);
	  	
	  	//Get Value from a different cell
	  	
	  	String CustomerID=row.getCell(1).getStringCellValue();
	  		
	  	System.out.println("Targetted Cell Value is ==> "+CustomerID);
	  	
	  	//Get Value from a selected cell
	  	String Pswd=row.getCell(2).getStringCellValue();
	  	System.out.println("Customer Paswrd is ==> "+Pswd);
	  	
	  	
	  	//Get Numeric Value from Targetting cell
	  	Double Mobile=row.getCell(3).getNumericCellValue();
	  	
	  	System.out.println(Mobile);
	  	
	  	String Mobile1=NumberToTextConverter.toText(Mobile);
	  	
	  	System.out.println("After Converting number to text, value is ==> "+Mobile1);
	  	
	  	//Get numeric value from a different cell
	  	
	  	double Value=row.getCell(4).getNumericCellValue();
	  	
	  	System.out.println(Value);
	  	
	  	//get numeric value from a cell, where it was converted to string on excel
	  	
	  	String Num_Value=row.getCell(5).getStringCellValue();
	  	
	  	System.out.println(Num_Value);
	  
  }
  
}
