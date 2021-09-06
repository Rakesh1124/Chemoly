package com.Chemoly.GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	/**
	 * This generic reusable method is used to read the data from property file
	 * @param propPath
	 * @param key
	 * @return propValue
	 * @throws Trowable
	 */
	public String readpropertyData(String propPath,String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key, "Incorrect key");
		return propValue;
		
	}
	
	/**
	 * This generic reusable method is used to read data from excel file
	 * @param path
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param excelValue
	 * @throws Throwable 
	 */
	public String readExcelData(String path,String sheetName, int row, int cell) throws Throwable
	{
		FileInputStream fis =new FileInputStream(path);
	   Workbook wb = WorkbookFactory.create(fis);
	   String excelValue = wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
	   return excelValue;
	}
	   /**
	    * This generic reusable method is used to write the data inside excel file
	    * @param path
	    * @param sheetName
	    * @param row
	    * @param cell
	    * @param data
	 * @throws Throwable 
	    */
	   public void writeExcelData(String path, String sheetName,int row, int cell,String data) throws Throwable
	   {
		   FileInputStream fis =new FileInputStream(path);
		   Workbook wb = WorkbookFactory.create(fis);
		   wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
		   FileOutputStream fos = new FileOutputStream(path);
		   wb.write(fos);
	   }
	  /**
	   * This generic reusable method is used to count the total rows filled in any sheet of excel file
	   * @param path
	   * @param sheet
	   * @param rowCount
	   * @trows Trowable
	   */
	   public int getRowCount(String path,String sheet) throws Throwable
	   {
		   FileInputStream fis =new FileInputStream(path);
		   Workbook wb = WorkbookFactory.create(fis);
		   int rowCount = wb.getSheet(sheet).getLastRowNum();
		   return rowCount;
	   }
}

