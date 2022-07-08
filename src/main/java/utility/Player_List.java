package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Player_List {
	public String readExcelfile(int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\vipulb\\eclipse-workspace\\Rcb_Team_Validation_Program\\Data\\Team_list.xlsx");
	Sheet sh= WorkbookFactory.create(file).getSheet("sheet1");
    String input=sh.getRow(row).getCell(cell).getStringCellValue();
	return input;
}
}