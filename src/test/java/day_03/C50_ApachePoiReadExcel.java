package day_03;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C50_ApachePoiReadExcel {
//Workbook  Excel dosyamız.
//Sheet  Açık excel sekmesi (Sheet1, Sheet2, etc.)
//Row (Satır)  Java, yalnızca içeride veri varsa satırları sayar.
//Cells (Hücre)  Java her satıra bakar ve yalnızca hücrede veri varsa hücre sayısını sayar.

//workbook(excel)>worksheet(sheet)> row(satir)>cell(hucre) -> hiyerarsi

// Add the excel file on the resources folder.
// Open the file.
// Open the workbook using file input stream.
// Open the first worksheet.
// Go to first row.
// Go to first cell on that first row and print.
// Go to second cell on that first row and print.
// Go to 2nd row first cell and assert if the data equal to Russia.
// Go to 3rd row and print 2nd cell
// Find the number of used row.
// Print country, area key value pairs as map object.
// Verify that you have Türkiye on the list

@Test
    public void readExel() throws IOException{
    //C:\Users\Q-3442 HASAN\IdeaProjects\\untitled\src\test\resources\excelfile.xlsx

    String path=System.getProperty("user.dir")+"\\src\\test\\resources\\excelfile.xlsx";
    FileInputStream fis=new FileInputStream(path);

    Workbook wb= WorkbookFactory.create(fis);
    Sheet sheet=wb.getSheet("Sayfa1");
    Row row1=sheet.getRow(0);
    Cell cell=row1.getCell(0);

    System.out.println("cell = " + cell);
    System.out.println("cell.toString() = " + cell.toString());

    Cell r1c2=row1.getCell(1);
    System.out.println("r1c2 = " + r1c2);
    System.out.println("r1c2.toString() = " + r1c2.toString());

    Assert.assertEquals("Rusya",sheet.getRow(1).getCell(0).toString());

    String s2c3=sheet.getRow(2).getCell(1).toString();
    System.out.println("s2c3 = " + s2c3);

    Map<String,String>countryarea=new HashMap<String,String>();
    for (int i=0;i<=sheet.getLastRowNum();i++){
        String country=sheet.getRow(i).getCell(0).toString();
        String area=sheet.getRow(i).getCell(1).toString();
        countryarea.put(country,area);
    }

    Assert.assertTrue(countryarea.containsKey("Türkiye"));


}
}