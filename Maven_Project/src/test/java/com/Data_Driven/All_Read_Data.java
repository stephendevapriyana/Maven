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

public class All_Read_Data {
	
	public static  void all_read() throws IOException {
		
		File fil=new File("D:\\Selenium\\Maven_Project\\Excel\\New Microsoft Excel Worksheet.xlsx");
		
		FileInputStream fis=new FileInputStream(fil);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int pnr = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i <pnr; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int cell = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j <cell; j++) {
				
				Cell cell2 = row.getCell(j);
				
				CellType cellType = cell2.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					
					String stringCellValue = cell2.getStringCellValue();
					System.out.println(stringCellValue);
					
				}
				else if(cellType.equals(cellType.NUMERIC)) {
					
					double numericCellValue = cell2.getNumericCellValue();
					
					int data=(int) numericCellValue;
					System.out.println(data);
				}
			}
			
			
			
		}
		
	
		
	}
	public static void main(String[] args) throws IOException {
		
		all_read();
		
	}

}
