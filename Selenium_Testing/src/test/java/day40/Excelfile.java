package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfile {

	public static void main(String[] args) throws IOException {
		
	FileInputStream doc=new FileInputStream(System.getProperty("user.dir")+"\\Test data\\Team1 & Team 2 Updates.xlsx");	
    XSSFWorkbook file=new XSSFWorkbook(doc);
    XSSFSheet sheet = file.getSheet("Sheet1");
    int rowsize=sheet.getLastRowNum();
    int cellsize=sheet.getRow(1).getLastCellNum();
    System.out.println(rowsize);
    System.out.println(cellsize);
    for(int r=0;r<=rowsize;r++)
    {
        XSSFRow currentrow= sheet.getRow(r);
    	
    	for(int c=0;c<cellsize;c++)
    	{
    		XSSFCell cell=currentrow.getCell(c);
    		System.out.print(cell.toString()+"\t");
    	}
    	System.out.println();
    	
    }
    file.close();
    doc.close();
    
	}

}
