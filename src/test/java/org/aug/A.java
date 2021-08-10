package org.aug;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {
	
	public String getdata(int rowNo, int cellNo) throws IOException {

		File file=new File("C:\\Users\\Gopinath\\eclipse-workspace\\August\\Excel\\Book1.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Datas");

Row row = sheet.getRow(rowNo);
Cell cell = row.getCell(cellNo);
String name = cell.getStringCellValue();
return name;

	}
	
	
}
