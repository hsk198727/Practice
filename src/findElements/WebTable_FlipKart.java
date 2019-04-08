package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable_FlipKart {

	public static void main(String[] args) throws Exception 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		
		//Identify Element
		WebElement Element=driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		action.moveToElement(Element).build().perform();
		
		driver.findElement(By.linkText("Mi")).click();
		
		//Identify Table
		
		List<WebElement> table=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]"));
		
		System.out.println("Number of rows==> "+table.size());
		
		
		
//		//Identify Element
//		WebElement Element1;
//		Element1=driver.findElement(By.className("_2zg3yZ"));
//		
//		
//		Thread.sleep(3000);
//		
//		
//		//Identify Group Elements
//		List<WebElement>Elements;
//		Elements=Element1.findElements(By.tagName("a"));
//		int Count=Elements.size();
//		System.out.println(Count);
//		
		
		
		
		
		
		
//		for (int i = 0; i < Count; i++) 
//		{
//			WebElement EachElement=Elements.get(i);
//			
//			String linkname=EachElement.getText();
//			
//			String linkref=EachElement.getAttribute("href");
//			
//			System.out.println(linkname+"        "+linkref);
//			
//			Thread.sleep(2000);
//			
//			EachElement.click();		
//			
//			//Restore all Elements
//			Element1=driver.findElement(By.className("_2zg3yZ"));
//			Elements=Element1.findElements(By.tagName("a"));
//			
//			
			
		}
		
	}


