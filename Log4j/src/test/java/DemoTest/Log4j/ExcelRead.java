package DemoTest.Log4j;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\KHUSHI SHAH\\OneDrive\\Desktop\\testing.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
	    try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet sh = wb.getSheet("test");
			
			System.out.println("The name of sheet is: "+sh.getSheetName());
			
			System.out.println(sh.getRow(2).getCell(0).getStringCellValue());
			
			System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
			
			System.out.println("Total number of rows: "+sh.getPhysicalNumberOfRows());
			
			System.out.println("Total number of cols: "+sh.getRow(2).getPhysicalNumberOfCells());
			
		
		
		}
	    
	    
	    
	    
		

	}

}
