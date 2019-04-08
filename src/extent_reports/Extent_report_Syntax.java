package extent_reports;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_report_Syntax {

	public static void main(String[] args) 
	{
		//Create location to save reports
		String filepath="D:\\Selenium\\Projects\\SELENIUM\\src\\Reports\\";
		
		//Create Object for Extent Reports
		ExtentReports logger=new ExtentReports(filepath+"MyTest.html", true);
		
		//Create Test Report1
		ExtentTest report1=logger.startTest("Test Case1");
		report1.log(LogStatus.INFO, "Lanuch Browser Successful");
		report1.log(LogStatus.SKIP, "Test Skip");
		report1.log(LogStatus.PASS, "Test Pass");
		report1.log(LogStatus.FATAL, "Critical Issue, need to report it to the DevTeam");
		logger.endTest(report1);
		
		//Create Test Report2
		
		ExtentTest report2=logger.startTest("TestCase2");
		report2.log(LogStatus.ERROR, "Lanch Fail");
		report2.log(LogStatus.INFO, "I informed");
		report2.log(LogStatus.UNKNOWN, "Unknown Issue");
		logger.endTest(report2);
		
		//Create Test Report3
		ExtentTest report3=logger.startTest("TestCase3");
		report3.log(LogStatus.INFO, "Informed");
		report3.log(LogStatus.FAIL, "I failed");
		report3.log(LogStatus.PASS, "passed");
		
		//Segregate all the reports in an order
		report1.appendChild(report2).appendChild(report3);
		
		
		//Write File	
		logger.flush();
		
		

	}

}
