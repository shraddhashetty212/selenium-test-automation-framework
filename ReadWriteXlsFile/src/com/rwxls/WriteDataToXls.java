package com.rwxls;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToXls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//step 1 - create an object of the XSSFWorkBook which is in apache poi libraries added
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//step 2 - create a sheet in the workbook
		XSSFSheet sheet1 = workbook.createSheet("Sheet1");
		
		//step 3 - create row and columns
		Row r00 = sheet1.createRow(0);
		Cell c00 = r00.createCell(0);
		Cell c01 = r00.createCell(1);
		Cell c02 = r00.createCell(2);
		
		Row r1 = sheet1.createRow(1);
		Cell c10 = r1.createCell(0);
		Cell c11 = r1.createCell(1);
		Cell c12 = r1.createCell(2);
		
		//step 4 - write data in a cell
		c00.setCellValue("Shraddha Shetty");
		c01.setCellValue(true);
		c02.setCellValue(56.78);
		c10.setCellValue(100.89);
		c11.setCellValue("Vikas Shetty");
		c12.setCellValue(false);
		
		//step 5 - create object of File class and reference that in FileOutputStream class
		File f = new File("/Users/shraddhashetty/eclipse-workspace/ReadWriteXlsFile/src/com/data/TestDataExcel1.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		
		//step 6 - write into the workbook
		workbook.write(fos);
		
		//step 7 - close the file output stream
		fos.close();
		
		//step 8 - close the workbook
		workbook.close();
		System.out.println("File is written successfully");

	}

}

/*
 * https://poi.apache.org/apidocs/dev/index.html
 * Class SXSSFWorkbook
 * SXSSFWorkbook() -> Construct a new workbook with default row window size
 * Class SXSSFSheet
 */
