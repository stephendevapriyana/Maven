package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void write() throws IOException {
		
		File f=new File("C:\\Users\\ELCOT.LENOVO\\Desktop\\write_data.xlsx");
		
		FileInputStream fis =new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		wb.createSheet("wirtedata1").createRow(0).createCell(0).setCellValue("Username");
		
		wb.getSheet("wirtedata1").getRow(0).createCell(1).setCellValue("password");
		
		wb.getSheet("wirtedata1").getRow(0).createCell(2).setCellValue("designation");
		
		wb.getSheet("wirtedata1").createRow(1).createCell(0).setCellValue("stephendevapriyan");
		
		wb.getSheet("wirtedata1").getRow(1).createCell(1).setCellValue("stephen12456367877");
		
		wb.getSheet("wirtedata1").getRow(1).createCell(2).setCellValue("Developer");
		
		wb.getSheet("wirtedata1").createRow(2).createCell(0).setCellValue("danny");
		
		wb.getSheet("wirtedata1").getRow(2).createCell(1).setCellValue("danny12897987958");
		
		wb.getSheet("wirtedata1").getRow(2).createCell(2).setCellValue("QA");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("Done");
		
		}

	public static void main(String[] args) throws IOException {
		
		write();
		
	}
	
}
