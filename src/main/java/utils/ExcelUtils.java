package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static List<String> readExcelDataSingleCol(String path,String sheetName) throws Exception
	{
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum()-1;
		List<String> data=new ArrayList<String>();
		
		for(int i=0;i<row+1;i++)
		{
			data.add(sheet.getRow(i).getCell(0).toString());
		}
		wb.close();
		return data;
	}

}
