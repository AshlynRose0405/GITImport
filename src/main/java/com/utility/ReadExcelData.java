package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	static File file;

	static Workbook workbook;

	static Sheet sheet;

	static Row row;

	static Cell cell;

	static String userName;

	private static void readParticular() {

		try {
			file = new File("C:\\Users\\acer\\OneDrive\\Desktop\\Book1.xlsx");

			workbook = new XSSFWorkbook(file); // WookBook------> parameter constructor

			sheet = workbook.getSheetAt(0);

			row = sheet.getRow(2);

			cell = row.getCell(0); // cell=column

			userName = cell.getStringCellValue();

			System.out.println(userName);
		} catch (Exception e) {
			e.printStackTrace();

			System.out.println("EEROR IN READPARTICULAR METHOD");
		}

	}

	private static void readPArticularRowMultipleCell() {

		try {
			file = new File("C:\\Users\\acer\\OneDrive\\Desktop\\Book1.xlsx");

			workbook = new XSSFWorkbook(file); // WookBook------> parameter constructor

			sheet = workbook.getSheetAt(0);

			short lastCellNum = sheet.getRow(0).getLastCellNum();
			System.out.println("No of the cells " + lastCellNum);

			row = sheet.getRow(2);

			for (int i = 0; i < lastCellNum; i++) {
				cell = row.getCell(i); // cell=column
				userName = cell.getStringCellValue();
				System.out.println(userName);
			}

		} catch (Exception e) {
			e.printStackTrace();

			System.out.println("EEROR IN READPARTICULARROWMULTIPLECEL METHOD");
		}

	}

	private static void readAllData() {

		try {
			file = new File("C:\\Users\\acer\\OneDrive\\Desktop\\Book1.xlsx");

			workbook = new XSSFWorkbook(file); // WookBook------> parameter constructor

			sheet = workbook.getSheetAt(0);

			short lastCellNum = sheet.getRow(0).getLastCellNum();
			System.out.println("No of the cells " + lastCellNum);

			int lastRowNum = sheet.getLastRowNum();
			System.out.println("No of the rows "+lastRowNum);

			// getPhysicalNumberOfRows -----> include the header also

			for (int i = 1; i <= lastRowNum; i++) {
				for (int j = 0; j < lastCellNum; j++) {
					Cell cell2 = sheet.getRow(i).getCell(j);
					 DataFormatter dataFormatter = new DataFormatter();
					 String formatCellValue = dataFormatter.formatCellValue(cell2);
					 System.out.println(formatCellValue);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

			System.out.println("EEROR IN READALL METHOD");
		}

	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// readParticular();
		// readPArticularRowMultipleCell();
		readAllData();
	}

}
