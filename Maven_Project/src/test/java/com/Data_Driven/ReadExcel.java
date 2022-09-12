package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		
		File fi=new File("D:\\Selenium\\Maven_Project\\Excel\\New Microsoft Excel Worksheet.xlsx");
		
		FileInputStream op=new FileInputStream(fi);
		
		Workbook wo=new XSSFWorkbook(op);
		
		Sheet sheetAt = wo.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		for (int i = 0; i < 2; i++) {
			Cell cell = row.getCell(i);
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
		}
		
		
		
		
		
		
		
	}
	

}
