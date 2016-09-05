package Factory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataProvider.ConfigdataProv;

public class browserfactory {
	
	static WebDriver driver;
	
	public static WebDriver GetBrowser(String browserName) throws IOException
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
				{	
				
		
				System.setProperty("webdriver.chrome.driver",DataProviderConfig.getconfigfrompro().GetChromePath());
				driver=new ChromeDriver();
				}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{	
		ConfigdataProv Config=new ConfigdataProv();

		System.setProperty("webdriver.chrome.driver",DataProviderConfig.getconfigfrompro().GetIEPath());
		driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		return driver;
	}
		
		public static void closeDriver(WebDriver driver)
		{
			
			driver.close();
		
		}
 		
}
		
		



