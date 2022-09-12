package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void read_data() throws IOException {
		
		
		File f=new File("D:\\Selenium\\Maven_Project\\Excel\\New Microsoft Excel Worksheet.xlsx");
		
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(1);
		
		CellType cellType = cell.getCellType();
//		
////		String stringCellValue = cell.getStringCellValue();
////		System.out.println(stringCellValue);
//		
//		double numericCellValue = cell.getNumericCellValue();
//		System.out.println(numericCellValue);
		
		if (cellType.equals(cellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		else if(cellType.equals(cellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
			
		}
	}
		
public static void main(String[] args) throws IOException {
		
		read_data();
		
	}

}
