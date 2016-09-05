package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class helper {
	
	public static String CaptureScreenShot(WebDriver driver,String NameOfScreenshot)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String ReportPath="D://Swathi_WS//com.learnautomation.hybrid//Screenshots"+NameOfScreenshot+System.currentTimeMillis()+".png";
		
		try {
			FileUtils.copyFile(src, new File(ReportPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to create screenshot"+e.getMessage());
		}
		
		return ReportPath;
		
	}

}
