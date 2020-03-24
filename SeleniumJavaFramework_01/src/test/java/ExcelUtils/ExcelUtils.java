package ExcelUtils;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	static String Projectpath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String args[])
	{
		getRowCount();
		getcelldataString();
	}
public static void getRowCount()
{
	
	try {
		XSSFWorkbook workbook = new XSSFWorkbook(Projectpath+"/Excel Data/Excel Data_Demo.xlsx");
		 sheet = workbook.getSheet("Sheet1");
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
public static void getcelldataString()
{
	try {
		XSSFWorkbook workbook = new XSSFWorkbook(Projectpath+"/Excel Data/Excel Data_Demo.xlsx");
		 sheet = workbook.getSheet("Sheet1");
		 String celldata_0 = sheet.getRow(0).getCell(0).getStringCellValue(); //Get String value
		 System.out.println(celldata_0);
		 //sheet.getRow(1).getCell(1).getNumericCellValue();  //Numeric value
		 
	}
	catch (IOException e) 
	{
		System.out.println(e.getMessage());;
		System.out.println(e.getCause());;
		e.printStackTrace();
	}
}
}
