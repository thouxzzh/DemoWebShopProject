//package com.utils;
//
//import java.io.FileInputStream;
//import org.apache.poi.ss.usermodel.*;
//
//public class ExcelUtils {
//
//    private static Workbook workbook;
//
//    public static String getCellData(String sheetName, int rowNum, int colNum) {
//        String cellValue = "";
//        try {
//            FileInputStream fis = new FileInputStream("C:\\Users\\thous\\git\\DemoWebShopProject\\com.DemoWebShopProject\\src\\test\\resources\\TestData.xlsx");
//            workbook = WorkbookFactory.create(fis);
//            Sheet sheet = workbook.getSheet(sheetName);
//            Row row = sheet.getRow(rowNum);
//            Cell cell = row.getCell(colNum);
//            cellValue = cell.toString();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return cellValue;
//    }
//}

package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {

    private static Workbook workbook;
    private static Sheet sheet;

    // Load Excel file and sheet
    public static void setExcelFile(String excelPath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\thous\\git\\DemoWebShopProject\\com.DemoWebShopProject\\src\\test\\resources\\TestData.xlsx");
        workbook = WorkbookFactory.create(fis);
        sheet = workbook.getSheet(sheetName);
    }

    // Get data from Excel (by row and column)
    public static String getCellData(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(colNum);
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(cell);
    }

    // Get row count
    public static int getRowCount() {
        return sheet.getLastRowNum() + 1;
    }
}

