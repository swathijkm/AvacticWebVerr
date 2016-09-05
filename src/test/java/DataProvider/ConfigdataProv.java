package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigdataProv {
	
	Properties pro;
	
	public ConfigdataProv() throws IOException
{
		
		File file=new File("./Configuration/config.properties");
		
		try {
			FileInputStream Fis=new FileInputStream(file);
			
			pro=new Properties();
			
			pro.load(Fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is"+e.getMessage());
		}
}
	
		public String GetAPPURL()
		{
			
			String APPURL=pro.getProperty("URL");
			
			return APPURL;
		}
		
		public String GetChromePath()
		{
			
			String APPURL=pro.getProperty("ChromeDriverPath");
			
			return APPURL;
		}
		
		
		public String GetIEPath()
		{
			
			String APPURL=pro.getProperty("IEDriverPath");
			
			return APPURL;
		}
		
		
}
