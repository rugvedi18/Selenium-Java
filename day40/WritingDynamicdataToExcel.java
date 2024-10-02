package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicdataToExcel {

	public static void main(String[] args) throws IOException {

		// file --> workbook --> sheet --> rows --> cell

		XSSFWorkbook workbook = new XSSFWorkbook(); // create new workbook

		XSSFSheet sheet = workbook.createSheet("Dynamic Data"); // create a sheet

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows: ");
		int noOfRows = sc.nextInt();

		System.out.println("Enter no of cells: ");
		int noOfCells = sc.nextInt();

		for (int r = 0; r < noOfRows; r++) {

			XSSFRow currentRow = sheet.createRow(r); // created new row

			for (int c = 0; c < noOfCells; c++) {
				XSSFCell cell = currentRow.createCell(c); // created new cell
				cell.setCellValue(sc.next()); // taking cell data from the user
			}
		}

		FileOutputStream file = new FileOutputStream(
				System.getProperty("user.dir") + "\\testData\\myfile_dynamic.xlsx");
		workbook.write(file);

		workbook.close();
		file.close();

		System.out.println("File is created..!");

	}

}
