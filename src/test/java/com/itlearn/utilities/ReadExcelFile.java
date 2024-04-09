package com.itlearn.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static  XSSFRow row;
	public static  XSSFCell cell;
	
	public static String getCellValue(String fileName,String sheetName,int rowNo,int ColNo)
	{
		try {
			fis= new FileInputStream(fileName);
			workbook=new XSSFWorkbook(fis);
			sheet=workbook.getSheet(sheetName);
			cell=workbook.getSheet(sheetName).getRow(rowNo).getCell(ColNo);
			
			workbook.close();
			
			return cell.getStringCellValue();
			
		} 
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			return "";
		}
	}
	
	public static int  getRowCount(String fileName,String sheetName)
	{
		try {
			fis= new FileInputStream(fileName);
			workbook=new XSSFWorkbook(fis);
			sheet=workbook.getSheet(sheetName);
			
			int row=sheet.getLastRowNum()+1;
			workbook.close();
			return row;
			
			
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			return 0;
		}
		
	}
	
	public static int  getColCount(String fileName,String sheetName)
	{
		try {
			fis= new FileInputStream(fileName);
			workbook=new XSSFWorkbook(fis);
			sheet=workbook.getSheet(sheetName);
			
			int col=sheet.getRow(0).getLastCellNum();
			workbook.close();
			return col;
			
			
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			return 0;
		}
		
	}
	
	public String getStringData(int sheetIndex,int row,int column)
	{
		return workbook.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String sheetName,int row,int column)
	{
		return workbook.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName,int row,int column)
	{
		return workbook.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
