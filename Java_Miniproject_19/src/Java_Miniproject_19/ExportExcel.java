package Java_Miniproject_19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportExcel {

	public static void main(String[] args) {
		
//		Data are needed to export
		
		int[] serial = new int[10];
		for (int i = 0; i < serial.length; i++) {
			serial[i] = i + 1;
		}
		
		String[] name = new String[10];
		name[0] = "Student A";
		name[1] = "Student B";
		name[2] = "Student C";
		name[3] = "Student D";
		name[4] = "Student E";
		name[5] = "Student F";
		name[6] = "Student G";
		name[7] = "Student H";
		name[8] = "Student I";
		name[9] = "Student J";
		
		String[] result = new String[10];
		result[0] = "Pass";
		result[1] = "Pass";
		result[2] = "Fail";
		result[3] = "Pass";
		result[4] = "Pass";
		result[5] = "Fail";
		result[6] = "Fail";
		result[7] = "Pass";
		result[8] = "Pass";
		result[9] = "Fail";
		
//		Create a Workbook
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
//		Creating Cell Style
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setAlignment(HorizontalAlignment.CENTER);
		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		
//		Create a spread Sheet
		
		XSSFSheet sheet = workbook.createSheet("Results");
		
//		Create a Row Object
		
		XSSFRow row;
		
//		Create Cell & Values
		
		row = sheet.createRow(0);
		Cell cell0 = row.createCell(0);
		Cell cell1 = row.createCell(1);
		Cell cell2 = row.createCell(2);
		
		cell0.setCellStyle(cellStyle);
		cell1.setCellStyle(cellStyle);
		cell2.setCellStyle(cellStyle);
		
		cell0.setCellValue("Serial No.");
		cell1.setCellValue("Name Of The Students");
		cell2.setCellValue("Results");
		
//		Create Cells & Rows for Data
		
		for (int i = 0; i < serial.length; i++) {
			
			row = sheet.createRow(i + 1);
			
			for (int j = 0; j < 3; j++) {
				
				Cell cell = row.createCell(j);
				cell.setCellStyle(cellStyle);
				
				if (cell.getColumnIndex() == 0) {
					cell.setCellValue(serial[i]);
				}
				else if (cell.getColumnIndex() == 1) {
					cell.setCellValue(name[i]);
				}
				else if (cell.getColumnIndex() == 2) {
					cell.setCellValue(result[i]);
				}
				
			}
			
		}
		
//		Auto Resize Columns
		
		for (int i = 0; i < 5; i++) {
			
			sheet.autoSizeColumn(i);
			
		}
		
//		Writing the created Excel File
		
//		try {
//			
//			FileOutputStream fileOutputStream = new FileOutputStream(new File("F:\\Result.xlsx"));
//			workbook.write(fileOutputStream);
//			workbook.close();
//			System.out.println("Excel File Create Successfully!");
//			
//		} catch (FileNotFoundException e) {
//			Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, e);
//		}catch (IOException e) {
//			Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, e);
//		}	
		
		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.setDialogTitle("Save File");
		jFileChooser.setSelectedFile(new File("Result.xlsx"));
		if (jFileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			
			File output = jFileChooser.getSelectedFile();
			try (FileOutputStream out = new FileOutputStream(output)) {
				
				workbook.write(out);
				out.close();
				System.out.println("Excel File Create Successfully!");
				
			} catch (FileNotFoundException e) {
				Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, e);
			}catch (IOException e) {
				Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, e);
			}
			
		}

	}

}
