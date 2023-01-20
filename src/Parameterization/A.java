package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
public static void main(String[] args) throws Throwable {
	
	FileInputStream file= new FileInputStream("C:\\Users\\sky\\Documents\\Parameterization.xlsx");
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
	/*FileInputStream  file= new FileInputStream("C:\\Users\\sky\\Documents\\Parameterization.xlsx");
	double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	
	System.out.println(data);*/
	

	
	
}
}
