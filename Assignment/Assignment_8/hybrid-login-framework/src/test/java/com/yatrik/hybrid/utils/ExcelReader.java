package com.yatrik.hybrid.utils;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelReader {
	
	 private Workbook workbook;

	    public ExcelReader(String filePath) {
	        try {
	            FileInputStream fis = new FileInputStream(filePath);
	            workbook = new XSSFWorkbook(fis);
	        } catch (Exception e) {
	            throw new RuntimeException("Cannot read Excel file: " + filePath, e);
	        }
	    }

	    public int getRowCount(String sheetName) {
	        return workbook.getSheet(sheetName).getLastRowNum();
	    }

	    public String getCellData(String sheetName, int rowNum, int colNum) {
	        DataFormatter df = new DataFormatter();
	        Row row = workbook.getSheet(sheetName).getRow(rowNum);
	        if (row == null) return "";
	        Cell cell = row.getCell(colNum);
	        if (cell == null) return "";
	        return df.formatCellValue(cell);
	    }

}
