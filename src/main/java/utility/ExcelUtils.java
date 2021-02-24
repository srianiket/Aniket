package utility;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
//	public static void main(String[] args) throws IOException {
//		getRowcount();
//		getColcount(1,1);
//	}
	public static void getRowcount() throws IOException
	{
	try
	{
//	String projectpath = System.getProperty("user.dir");
	@SuppressWarnings("resource")
	XSSFWorkbook workbook = new XSSFWorkbook("G:\\eclipse-workspace\\Aniket\\src\\test\\resources\\Excel\\data.xlsx");
	XSSFSheet sheet = workbook.getSheet("TD_001");
	int rowcount = sheet.getPhysicalNumberOfRows();
	System.out.println("Number of Rows: " + rowcount);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}
	}
	public static void getColcount(int rowNum , int colNum)
	{
		try
		{
		workbook = new XSSFWorkbook("G:\\eclipse-workspace\\Aniket\\src\\test\\resources\\Excel\\data.xlsx");
		sheet = workbook.getSheet("TD_001");
		int colcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Columns: " + colcount);
		String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(cellData);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public String readCellData(int rowNum,int colNum) throws IOException
	{
		System.out.println("read cells");
		XSSFWorkbook workbook = new XSSFWorkbook("G:\\eclipse-workspace\\Aniket\\src\\test\\resources\\Excel\\data.xlsx");
		XSSFSheet sheet = workbook.getSheet("TD_001");
		DataFormatter dataFormatter = new DataFormatter();
		String value = dataFormatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		return value;
	}
}
