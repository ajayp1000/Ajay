package org.demo.util;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil 
{
	XSSFWorkbook workbook;
	XSSFSheet sheetAt;
	int sheetNo;
	String FilePath;
	
	public Excelutil(String FilePath,int sheetNo) 
	{
		this.FilePath=FilePath;
		this.sheetNo=sheetNo;
		
	}
	
	public void loadExcel() throws InvalidFormatException, IOException 
	{
		File file=new File(FilePath);
		workbook=new XSSFWorkbook(file);
		sheetAt = workbook.getSheetAt(sheetNo);
	}

    public int noofrows(int sheetNo)
	{
		int  row= sheetAt.getLastRowNum();
		row=row+1;
		return row;
	}
	
	public String getcellvalue(int rowno,int colno)
	{
		XSSFRow row=sheetAt.getRow(rowno);
		XSSFCell cell=row.getCell(colno);
		return cell.toString().trim();
	}
	
}

	


