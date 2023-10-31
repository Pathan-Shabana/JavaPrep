package projectRelatedPackage;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"/src/ExcelData/testdata.xlsx");
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	int rows= sheet.getLastRowNum();
	
	for(int i=1;i<=rows;i++)
	{
		XSSFRow row=sheet.getRow(i);
		int column=row.getLastCellNum();
		for(int j=0;j<column;j++)
		{
		System.out.print(row.getCell(j).getStringCellValue()+" ");
		}
		System.out.println();
		
	}
	wb.close();
	}

}
