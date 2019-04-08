package sikuli;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

import libs.Utility;

public class Sikuli_sample 
{

	public static void main(String[] args) throws SikuliException, InterruptedException, IOException 
	{
		String filepath="D:\\Selenium\\Projects\\SELENIUM\\Screens\\";
		
		//Create object for Sikuli
		
		Screen sikuli=new Screen();
						
		Pattern img1=new Pattern(filepath+"R1");
		Pattern img2=new Pattern(filepath+"F1");
		Pattern img3=new Pattern(filepath+"T1");
		Pattern img4=new Pattern(filepath+"D1");
		Pattern img5=new Pattern(filepath+"10");
		Pattern img6=new Pattern(filepath+"RTND");
		Pattern img7=new Pattern(filepath+"Adults");
		Pattern img8=new Pattern(filepath+"Child");
		Pattern img9=new Pattern(filepath+"Infants");
		Pattern img10=new Pattern(filepath+"SearchFlights");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Utility.captureScreenShot(driver, "Broswer Started");
		
		
		Thread.sleep(3000);
		
		sikuli.click(img1);
		sikuli.type(img2, "Hyd");
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
//		Thread.sleep(6000);
		sikuli.type(img3, "Bang");
		driver.findElement(By.linkText("Bangalore, IN - Kempegowda International Airport (BLR)")).click();
		sikuli.click(img4);
		sikuli.click(img5);
		Thread.sleep(5000);
		sikuli.click(img6);
		sikuli.click(img7);
		sikuli.type("4");
		sikuli.click(img8);
		sikuli.type("2");
		sikuli.click(img9);
		sikuli.type("2");
		sikuli.click(img10);
		
		Utility.captureScreenShot(driver, "Broswer Ended");
		
		
		}
	}


