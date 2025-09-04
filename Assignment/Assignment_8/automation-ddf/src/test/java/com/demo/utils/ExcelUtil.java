package com.demo.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class ExcelUtil {

    public static Object[][] readSheet(String filePath, String sheetName) {
        try (InputStream is = new FileInputStream(filePath);
             Workbook wb = new XSSFWorkbook(is)) {

            Sheet sheet = wb.getSheet(sheetName);
            if (sheet == null) throw new IllegalArgumentException("Sheet not found: " + sheetName);

            @SuppressWarnings("unused")
			Row header = sheet.getRow(0);
            int lastRow = sheet.getLastRowNum();
            List<Object[]> rows = new ArrayList<>();

            for (int r = 1; r <= lastRow; r++) {
                Row row = sheet.getRow(r);
                if (row == null) continue;

                String email = getCellString(row.getCell(0));
                String password = getCellString(row.getCell(1));
                String expected = getCellString(row.getCell(2));

                if (email == null || email.isBlank()) continue;
                rows.add(new Object[]{email, password, expected});
            }
            Object[][] data = new Object[rows.size()][];
            for (int i = 0; i < rows.size(); i++) data[i] = rows.get(i);
            return data;

        } catch (IOException e) {
            throw new RuntimeException("Failed to read Excel: " + filePath, e);
        }
    }

    @SuppressWarnings("deprecation")
	private static String getCellString(Cell cell) {
        if (cell == null) return null;
        cell.setCellType(CellType.STRING);
        return cell.getStringCellValue().trim();
    }
}
