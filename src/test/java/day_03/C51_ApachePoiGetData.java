package day_03;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jetbrains.annotations.Contract;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C51_ApachePoiGetData {

    String sheetname;
    int sheetIndex;
    int rowindex;
    int columnIndex;


    public static Object getdata(String sheetname, int rowindex, int columnIndex) throws IOException {
        String istenendata="";
        String path=System.getProperty("user.dir")+"\\src\\test\\resources\\excelfile.xlsx";

        FileInputStream fis=new FileInputStream(path);
        Workbook wb= WorkbookFactory.create(fis);
        istenendata=wb.getSheet(sheetname).getRow(rowindex).getCell(columnIndex).toString();

        return istenendata;
    }
}
