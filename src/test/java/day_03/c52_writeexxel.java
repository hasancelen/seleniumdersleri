package day_03;

import org.apache.commons.collections4.Get;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class c52_writeexxel {
    @Test
    public void writeexxel() throws IOException{
       /* Create an object of File class to open xlsx file.
        Create an object of FileInputStream class to read excel file.
        Create an object of FileInputStream class to read excel file.
        Creating workbook instance that refers to .xlsx file.
        Creating a Sheet object.
        Get all rows in the sheet.
        Create a row object to retrieve row at index 3.
        Create a cell object to enter value in it using cell Index.
        Write the data in excel using output stream.*/
        String path=System.getProperty("user.dir")+"\\src\\test\\resources\\excelData .xlsx";

        FileInputStream fis=new FileInputStream(path);
        Workbook wb= WorkbookFactory.create(fis);
        Sheet credentialssheet=wb.createSheet("credentials");
        Row row17=credentialssheet.createRow(16);

        Cell r17c7=row17.createCell(6);
        r17c7.setCellValue("NAME");

        Cell r17c8=row17.createCell(7);
        r17c8.setCellValue("Email");

        Cell r17c9=row17.createCell(8);
        r17c7.setCellValue("Password");

        FileOutputStream fos=new FileOutputStream(path);
        wb.write(fos);

        wb.close();
        fis.close();
        fos.close();

    }
}
