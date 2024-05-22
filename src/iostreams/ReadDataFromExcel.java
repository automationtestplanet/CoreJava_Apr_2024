package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		File file1 = new File(System.getProperty("user.dir") + "\\InputData\\Test.xlsx");
		FileInputStream fis = new FileInputStream(file1);

		XSSFWorkbook workBook = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = workBook.getSheet("Languages");

		Iterator<Row> allRows = sheet1.rowIterator();

		while (allRows.hasNext()) {
			Row eachRow = allRows.next();

			Iterator<Cell> allCells = eachRow.cellIterator();

			while (allCells.hasNext()) {
				Cell eachCell = allCells.next();

				if (eachCell.getCellType() == Cell.CELL_TYPE_STRING) {
					String str = eachCell.getStringCellValue();
					System.out.print(str);
					System.out.print("    ");
				} else if (eachCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					double double1 = eachCell.getNumericCellValue();
					System.out.print(double1);
					System.out.print("    ");
				} else if (eachCell.getCellType() == Cell.CELL_TYPE_BLANK) {
				}
			}
			System.out.println();

		}
		
//		XSSFSheet newSheet = workBook.createSheet("April2024");
		
		XSSFSheet newSheet = workBook.getSheet("April2024");
		Row newRow = newSheet.createRow(0);		
		Cell newCell = newRow.createCell(0);
		newCell.setCellValue("This is New Cell Data");
		Cell newCell2 = newRow.createCell(1);
		newCell2.setCellValue("This is New Cell Data2");
		
		FileOutputStream fos = new FileOutputStream(file1);
		workBook.write(fos);
		fos.close();
		
	}

}
