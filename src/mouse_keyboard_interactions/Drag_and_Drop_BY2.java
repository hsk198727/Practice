package mouse_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_BY2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/products/mobiles-mobile-phones/filters/Form_s~Smartphones?");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Identify Slider1
		WebElement left_slider=driver.findElement(By.xpath("//div[@class=\"filter-price-slider ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all\"]/a[1]"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(left_slider, 50, 0).build().perform();
		Thread.sleep(3000);
		
		
		//Identify Slider2
		WebElement right_slider=driver.findElement(By.xpath("//div[@class=\"filter-price-slider ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all\"]/a[2]"));
		action.dragAndDropBy(right_slider, -40, 0).build().perform();
		
		
		
	}

}
