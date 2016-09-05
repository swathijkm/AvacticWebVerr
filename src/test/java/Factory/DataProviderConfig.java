package Factory;

import java.io.IOException;

import DataProvider.ConfigdataProv;
import DataProvider.ExcelDataProvider;

public class DataProviderConfig {
	
	
	public static ConfigdataProv getconfigfrompro() throws IOException
	{
		ConfigdataProv datafPro=new ConfigdataProv();
		
		return datafPro;
	}
	
	
	
	public static ExcelDataProvider getconfigfromexcel() throws IOException
	{
		ExcelDataProvider datafexcel=new ExcelDataProvider();
		
		return datafexcel;
	}
	

}
