package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// file --> workbook --> sheet --> rows --> cell

public class WritingDataFromExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook(); // create new workbook

		XSSFSheet sheet = workbook.createSheet("Data"); // create a sheet

		XSSFRow row1 = sheet.createRow(0); // create a row
		row1.createCell(0).setCellValue("ID");
		row1.createCell(1).setCellValue("Name");
		row1.createCell(2).setCellValue("Number");

		XSSFRow row2 = sheet.createRow(1); // create a row
		row2.createCell(0).setCellValue("AS1");
		row2.createCell(1).setCellValue("John Doe");
		row2.createCell(2).setCellValue(918765654);

		XSSFRow row3 = sheet.createRow(2); // create a row
		row3.createCell(0).setCellValue("AS2");
		row3.createCell(1).setCellValue("Smith Ronaldo");
		row3.createCell(2).setCellValue(916567898);

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\myfile.xlsx");
		workbook.write(file);

		workbook.close();
		file.close();

		System.out.println("File is created..!");

	}

}
