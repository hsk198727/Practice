package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_row_cell {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//a[contains(.,'markets')]")).click();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//Identify Table
		WebElement table=driver.findElement(By.id("dvBSE"));
		
		js.executeScript("arguments[0].scrollIntoView();", table);
		
		//Identify table rows
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		//select row
		WebElement selected_row=rows.get(4);
		
		//Identify cells
		List<WebElement>cell=selected_row.findElements(By.tagName("td"));
		
		WebElement selected_cell=cell.get(0);
		
		String c_value=selected_cell.getText();
		
		WebElement High_price=cell.get(3);
		
		String H_value=High_price.getText();
		
		System.out.println(c_value+"====>"+H_value);
		
		Thread.sleep(5000);
		
		cell.get(7).click();

	}

}
