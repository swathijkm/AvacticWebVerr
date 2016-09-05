package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	static WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	@FindBy(xpath="html/body/div[1]/div/div/div[2]/div/ul/li[1]/span/a")
	WebElement signin;
	
	@FindBy(xpath="//a[@text='My Account']")
	WebElement MyAccount;
	
	@FindBy(xpath="//a[@text='My cart']")
	WebElement Mycart;
	
	@FindBy(xpath="//a[@text='Checkout']")
	WebElement Checkout;
	
	public void ClickOnSigninLink()
	{
		signin.click();
	}
	
	public void ClickOnMyAccount()
	{
		MyAccount.click();
	}
	
	
	public void ClickOnMycartLink()
	{
		Mycart.click();
	}
	
	
	public void ClickOnCheckoutLink()
	{
		Checkout.click();
	}
	
	
	public static String GetAppTitle()
	{
		
		return driver.getTitle();
	}
	
	
	

}
