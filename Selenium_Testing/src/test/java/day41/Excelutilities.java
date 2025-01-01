package day41;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities {
	
	public static FileInputStream input;
	public static FileOutputStream output;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static XSSFCellStyle style;
	
	public static int getRowcount(String XlFile, String XlSheet) throws IOException
	{
		input=new FileInputStream (XlFile);
		wb=new XSSFWorkbook(input);
		sheet=wb.getSheet(XlSheet);
		int rowcount =sheet.getLastRowNum();
		wb.close();
		input.close();
		return rowcount;
		
	}
	public static int getCellcount(String XlFile, String XlSheet, int rownum) throws IOException
	{
		input=new FileInputStream (XlFile);
		wb=new XSSFWorkbook(input);
		sheet=wb.getSheet(XlSheet);
		row=sheet.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		input.close();
		return cellcount;	
	}
	
	public static String getCelldata(String XlFile, String XlSheet, int rownum, int colnum) throws IOException
	{
		input=new FileInputStream (XlFile);
		wb=new XSSFWorkbook(input);
		sheet=wb.getSheet(XlSheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
	    String data;
	try 
	{
		data=cell.toString();	
	}
	
	catch(Exception e)
	{
	     data="";	
	}
	wb.close();
	input.close();
	return data;
	}
	
	public static void  setCelldata(String XlFile, String XlSheet, int rownum, int colnum, String data) throws IOException
	{
		input=new FileInputStream (XlFile);
		wb=new XSSFWorkbook(input);
		sheet=wb.getSheet(XlSheet);
		row=sheet.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		output=new FileOutputStream(XlFile);
		wb.write(output);
		wb.close();
		input.close();	
		output.close();
	}
	public static void fillgreencolour(String XlFile, String XlSheet, int rownum, int colnum) throws IOException
	{
		input=new FileInputStream (XlFile);
		wb=new XSSFWorkbook(input);
		sheet=wb.getSheet(XlSheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		output=new FileOutputStream(XlFile);
		wb.write(output);
		wb.close();
		input.close();
		output.close();
	}
	
	public static void fillredcolour(String XlFile, String XlSheet, int rownum, int colnum) throws IOException
	{
		input=new FileInputStream (XlFile);
		wb=new XSSFWorkbook(input);
		sheet=wb.getSheet(XlSheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		output=new FileOutputStream(XlFile);
		wb.write(output);
		wb.close();
		input.close();
		output.close();
	}
	
}
