package method_parameter;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Run_Repository extends Repository
{
	String URL="https://www.facebook.com/";
	Repository REP;
	String screenshotname;
	
  @Test
  		public void Enter_Test_data() throws Exception 
  {
	  //Enter Data using Locator
	  REP.EnterName(By.xpath("//input[contains(@id,'u_0_j')]"), "Sandeep");
	  
	  REP.captureScreenShot("Image1");
	  
	  REP.EnterName(By.xpath("//input[contains(@id,'u_0_l')]"), "Kumar");
	  
	  //Enter Data using Xpath
	  REP.EnterName("//input[contains(@id,'u_0_o')]", "hsk198727@gmail.com");
  }
  
  @BeforeMethod
  
  		public void setUp()
  {
	  //Create Object for Repository
	  REP=new Repository();
	  REP.launchBrowser("chrome");
	  REP.waitCommands(50);
	  REP.loadPage(URL);
	  
  }

  @AfterMethod
  		public void tearDown() throws Exception 
  {
	 REP.tearDown(1000);
  }

}
