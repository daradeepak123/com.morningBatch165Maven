package propFileLearn;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		
		//File file=new File("C:/demo/employee.xlsx");
		File file=new File(System.getProperty("user.dir")+"/src/test/resources/employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		String data=sheet.getRow(0).getCell(0).toString();
		System.out.println(data);
		
		
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum()-1;
		
		System.out.println(row);
		System.out.println(col);
		String[][] dataa=new String[row+1][col+1];
		
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=col;j++)
			{
				data=sheet.getRow(i).getCell(j).toString();
				//System.out.print(data+"\t");
				dataa[i][j]=data;
			}
			//System.out.println();
		}
		
		for(int i=0;i<dataa.length;i++)
		{
			for(int j=0;j<dataa[1].length;j++)
			{
				System.out.print(dataa[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		wb.close();

	}

}
