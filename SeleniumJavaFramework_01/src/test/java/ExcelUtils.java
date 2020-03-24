

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	public static void main(String args[])
	{
		getRowCount();
	}
public static void getRowCount()
{
	String Projectpath = System.getProperty("user.dir");
	try {
		XSSFWorkbook workbook = new XSSFWorkbook(Projectpath+"\\Excel Data\\Excel Data_Demo.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows: "+rowcount);
	} 
	catch (IOException e) 
	{
		System.out.println(e.getMessage());;
		System.out.println(e.getCause());;
		e.printStackTrace();
	}
}
}
