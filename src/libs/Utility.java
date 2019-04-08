package libs;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	public static void captureScreenShot(WebDriver driver, String screenshotname) throws IOException
	{
		Date d=new Date();
//		//Create simple date foramatter
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/hh-mm-ss");
//		//using simpel date foramt convert date
//		String time=sdf.format(d);
				
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("D:\\Selenium\\Projects\\SELENIUM\\Screens\\"+screenshotname+".png"));
		
				
		
	}
	
	
	
}
