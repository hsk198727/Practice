package global_Variables;

import org.openqa.selenium.By;

public class Locators 
{
	
	public static By First_name=By.xpath("//input[contains(@id,'u_0_j')]");
	public static By Surname=By.xpath("//input[contains(@id,'u_0_l')]");
	public static By Email=By.xpath("//input[contains(@id,'u_0_o')]");
	public static By Re_Enter_Email=By.xpath("//input[contains(@id,'u_0_r')]");
	
	public static By New_Pswd=By.xpath("//input[contains(@id,'u_0_v')]");
	
	public static By Day_DD1=By.xpath("//select[contains(@id,'day')]");
	public static By Month_DD1=By.xpath("//select[contains(@id,'month')]");
	public static By Year_DD1=By.xpath("//select[contains(@id,'year')]");
	
	public static By Rnd_btn=By.xpath("//input[contains(@id,'u_0_a')]");
	public static By Sigin_btn=By.xpath("//button[contains(@id,'u_0_11')]");
		

}
