package com.ajay.billing.user.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ajay.billing.model.Product;

public interface ExcelReader {
	public static ArrayList<Product> readXLS(File file) throws IOException {
		ArrayList<Product> productList = new ArrayList<>();
		if(!file.exists()) {
		return null;	
		}
		FileInputStream fs=new FileInputStream(file);
		HSSFWorkbook workbook=new HSSFWorkbook(fs);
		HSSFSheet sheet=workbook.getSheetAt(1);
		Iterator<Row> rows=sheet.rowIterator();
		while(rows.hasNext()) {
			Row currentRow=rows.next();//it returns current and move to next
			Iterator<Cell> cells=currentRow.cellIterator();
			while(cells.hasNext()) {
				Cell currentCell=cells.next();
				if(currentCell.getCellType()==CellType.STRING)
				{
					System.out.println(currentCell.getStringCellValue());
				}
				else if  (currentCell.getCellType()==CellType.NUMERIC)
				{
					System.out.println(currentCell.getNumericCellValue());
				}
			}
		}
		workbook.close();
		fs.close();
		
		return productList;
	}

}
