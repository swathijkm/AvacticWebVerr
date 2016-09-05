package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook WB;
	
	
	
	public ExcelDataProvider() throws IOException
	{
		File file=new File("./AppTestData/AppTestData.xlsx");
		
		
		try {
			FileInputStream fis=new FileInputStream(file);
			
			 WB=new XSSFWorkbook(fis);
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public String Getdata(String sheetname,int rownum,int colnum)
	{
		String result=WB.getSheet(sheetname).getRow(rownum).getCell(colnum).getStringCellValue();
		
		return result;
		
	}
	
	
	public String Getdata(int sheetindex,int rownum,int colnum)
	{
		String result=WB.getSheetAt(sheetindex).getRow(rownum).getCell(colnum).getStringCellValue();
		
		return result;
		
	}
	
	
	
	

}
