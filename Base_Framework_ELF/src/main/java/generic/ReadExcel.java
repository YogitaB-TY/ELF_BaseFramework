package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author Yogita
 *
 */

public class ReadExcel implements FrameworkConstants{

	public Workbook workbook;
	public static File filePath=new File(EXCEL_PATH);

	public String getData(String sheet, int row, int column) throws IOException {

		FileInputStream fis = new FileInputStream(filePath);
		workbook=WorkbookFactory.create(fis);
		Cell cell=workbook.getSheet(sheet).getRow(row).getCell(column);
		return cell.getStringCellValue();
	}

	public static Object[][] getMultipleData(String sheetName) throws IOException {

		FileInputStream fis=new FileInputStream(filePath);

		 
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet(sheetName);
		int row_count=sheet.getPhysicalNumberOfRows();
			
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[row_count][col_count];
		
		for(int r=0;r<=row_count-1;r++) {
			Row row=sheet.getRow(r);
			for(int c=0;c<row.getLastCellNum();c++) {
				data[r][c]=row.getCell(c).getStringCellValue();
			}
		}
		book.close();
		return data;
	}

}
