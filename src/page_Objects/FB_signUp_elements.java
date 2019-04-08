package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FB_signUp_elements 
{
	
	//List all FB Elements
	@FindBy(xpath = "//input[contains(@id,'u_0_j')]")
	WebElement FirstName_EB;
	
	@FindBy(xpath = "//input[contains(@id,'u_0_l')]")
	WebElement SurName_EB;
	
	@FindBy(xpath = "//input[contains(@id,'u_0_o')]")
	WebElement Mobile_EB;
	
	@FindBy(xpath = "//input[contains(@id,'u_0_r')]")
	WebElement Re_type_Email_EB;
	
	@FindBy(xpath = "//input[contains(@id,'u_0_v')]")
	WebElement Password_EB;
	
	@FindBy(xpath = "//select[contains(@id,'day')]")
	WebElement Day_DD;
	
	@FindBy(xpath = "//select[contains(@id,'month')]")
	WebElement Month_DD;
	
	@FindBy(xpath = "//select[contains(@id,'year')]")
	WebElement Year_DD;
	
	@FindBy(xpath = "//input[contains(@id,'u_0_9')]")
	WebElement Female_Rbtn;
	
	@FindBy(xpath = "//input[contains(@id,'u_0_a')]")
	WebElement Male_Rbtn;
	
	@FindBy(xpath = "//a[@href='/legal/terms/update'][contains(.,'Terms')]")
	WebElement Terms_link;
	
	@FindBy(xpath = "//a[@href='/about/privacy/update'][contains(.,'Data Policy')]")
	WebElement Date_link;
	
	@FindBy(xpath = "//a[@href='/policies/cookies/'][contains(.,'Cookie Policy')]")
	WebElement Cookie_link;
	
	@FindBy(xpath = "//button[contains(@id,'u_0_11')]")
	WebElement Signup_Btn;
	
	
	
	
	
	
	
	
	
	

}
