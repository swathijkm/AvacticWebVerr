package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	@FindBy(id="account_sign_in_form_email_id" )
	WebElement Login;
	
	@FindBy(id="account_sign_in_form_passwd_id")
	WebElement Passwd;
	
	@FindBy(xpath="//input[@class='btn btn-primary input_submit']" )
	WebElement signin;
	
	public void EnterUN()
	{
		
		Login.sendKeys("admin@selenium.com");
	}
	
	public void EnterPwd()
	{
		
		Passwd.sendKeys("admin@selenium.com");
	}
	
	public void ClickOnSigin()
	{
		
		signin.click();
	}
	
	public void LogininWebPage(String UN,String Pwd)
	{
		
		Login.sendKeys(UN);
		Passwd.sendKeys(Pwd);
		signin.click();
		
		
	}
	
	public void CloseTest()
	{
		
		driver.close();;
	}
	
	
	
	
	
	

}
