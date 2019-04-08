package mouse_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_BY_SBI_EMI 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://homeloans.sbi/calculators");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Identify Slider1
		WebElement slider1=driver.findElement(By.xpath("//div[@id='loanamountSlider_DEFAULTEMICAL']/span[1]"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(slider1, 150, 0).build().perform();
		Thread.sleep(3000);
		
		//Identify Slider2
		WebElement slider2=driver.findElement(By.xpath("//div[@id='loanTenureValueSlider_DEFAULTEMICAL']/span[1]"));
		action.dragAndDropBy(slider2, 130, 0).build().perform();
		Thread.sleep(3000);
		
		//Identify Slider3
		WebElement slider3=driver.findElement(By.xpath("//div[@id='loanInterestRateSlider_DEFAULTEMICAL']/span[1]"));
		action.dragAndDropBy(slider3, -90, 0).build().perform();
		
			
	}

}
