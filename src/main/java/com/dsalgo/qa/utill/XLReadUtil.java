package com.dsalgo.qa.utill;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReadUtil {
	
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static String PATH ="/Users/shwethamohanpulle/Documents/Projects/DSportalApplication/src/main/java/com"
			+ "/dsalgo/qa/testdata/DsalgoregisterData.xlsx";
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException {
		
		fis= new FileInputStream (xlfile);
		wb = new XSSFWorkbook (fis);
		 ws = wb.getSheet(xlsheet);
	int rowcount=ws.getLastRowNum();
	wb.close();
	fis.close();
	return rowcount;
		}
	
	
	public  static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException{
		fis= new FileInputStream (xlfile);
		wb = new XSSFWorkbook (fis);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		 int cellcount=row.getLastCellNum();
		 wb.close();
			fis.close();
			return cellcount;
	}
	
	public  static String getCellData(String xlfile,String xlsheet, int rownum,int column) throws IOException  {
		fis= new FileInputStream (xlfile);
		wb = new XSSFWorkbook (fis);
		ws = wb.getSheet(xlsheet);
	row = ws.getRow(rownum);
	 cell = row.getCell(column);
	 
	DataFormatter formatter = new DataFormatter ();
	String data;
	try {
	data = formatter.formatCellValue(cell); //Return the foramtted cell value as a string reagardless of the cell type.
	}
	catch(Exception e)
	{
		data = "";
	}
	wb.close();
	fis.close();	
	return data;
	}
}
