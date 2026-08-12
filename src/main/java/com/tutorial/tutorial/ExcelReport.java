package com.tutorial.tutorial;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReport {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Report");
        // Sample data
        Object[][] data = {
                {"ID", "Name", "Age"},
                {1, "John Doe", 30},
                {2, "Jane Smith", 25},
                {3, "Mike Johnson", 35}
        };

        Object[] data1 = {
                "ID", "Name", "Age",
        };

        int rowNum = 0;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : rowData) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        String folderPath = "C:\\Users\\Admin\\Downloads";

        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdirs();
        }
        String fileName = "OpenCloseStock_2026_07.xlsx";

        String fullPath = folderPath + "\\" + fileName;
        try (FileOutputStream outputStream = new FileOutputStream(fullPath)) {
            workbook.write(outputStream);
            System.out.println("ExcelReport.xlsx written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}