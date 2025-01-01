package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdatainexcel {

	public static void main(String[] args) throws IOException {
		 FileOutputStream doc=new FileOutputStream(System.getProperty("user.dir")+"\\Test data\\Team1 & Team 2 Updates.xlsx");
		 XSSFWorkbook file = new XSSFWorkbook();
		 XSSFSheet sheet1 = file.createSheet("mathi");
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter number of rows");
		 int rowsize=sc.nextInt();
		 System.out.println("Enter cell size");
		 int cellsize=sc.nextInt();
		 
		 for(int r=0;r<=rowsize;r++)
		 {
			XSSFRow currentrow = sheet1.createRow(r);
			for(int c=0;c<cellsize;c++)
			{
				XSSFCell cell = currentrow.createCell(c);
				System.out.println("enter cell values");
				cell.setCellValue(sc.next());
			}
		 }
		 file.write(doc);
		 file.close();
		 doc.close();
		 
				 System.out.println("File created");

	}

}
