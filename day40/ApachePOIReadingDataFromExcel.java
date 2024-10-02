package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Add poi dependecies in pom.xml file
// Excel file --> Workbook --> Sheets --> Rows --> Cells
// FileInputStream, FileOutputStream (provided by java)
// XSSFWorkbook --> XSSFSheet --> XSSFRow --> XSSFCell (4 classes provided by Apache POI)

public class ApachePOIReadingDataFromExcel {
	public static void main(String[] args) throws IOException {
		// locate and open file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file); // find workbook of the file

		// get excel sheet from the workbook
		// XSSFSheet sheet = workbook.getSheetAt(0); // by index
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // by sheet name

		int totalRows = sheet.getLastRowNum(); // get total no of rows

		int totalCells = sheet.getRow(1).getLastCellNum();

		System.out.println("Total no of rows: " + totalRows);
		System.out.println("Total no of cells: " + totalCells);

		for (int r = 0; r <= totalRows; r++) {

			XSSFRow currentRow = sheet.getRow(r); // get specific row

			for (int c = 0; c < totalCells; c++) {
				System.out.print(currentRow.getCell(c).toString() + "\t"); // get data from the cell
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
