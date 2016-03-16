package TestUtilityPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class CommonMethod {
	public static String path = "./src/TestDataPackage/testdata.xlsx" ;  // \src\firstpackage
	
	
//--------------------Method for read data from excel sheet------------------------------------------
	public static String[][] GetValue(String Pathfile, String sheetName, int startrow) throws IOException
		{
		   File excel= new File(Pathfile);
		   FileInputStream fis = new FileInputStream(excel);
		   @SuppressWarnings("resource")
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		   XSSFSheet ws = wb.getSheet(sheetName);
		   int colNum = ws.getRow(startrow).getLastCellNum();
		   String [][] arrays = new String [1][colNum];
		   for(int i=0;i<colNum;i++){
		    XSSFRow row= ws.getRow(startrow);
		    XSSFCell cell = row.getCell(i);
		    arrays[0][i] = cellToString(cell);
		   // System.out.println(arrays[0][i]);
		  }
		   return arrays;
		  }

		   private static String cellToString(XSSFCell cell) {
		   Object result;
		   int type = cell.getCellType();
		 
		   switch(type)
		   {
		   case 0:
		    result = cell.getNumericCellValue();
		    break;
		   case 1:
		    result = cell.getStringCellValue();
		    break;
		   default:
		    throw new RuntimeException("there are no support for this type of cell");
		   }
		   
		   return result.toString();

		 }
	
	

}
