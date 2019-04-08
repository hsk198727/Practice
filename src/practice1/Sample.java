package practice1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Sample {
  @Test
  public void TC001() 
  {
	  System.out.println("TEst Passsed");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before Method Pass");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After method passed");
  }

}
