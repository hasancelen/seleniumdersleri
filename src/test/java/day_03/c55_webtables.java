package day_03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.testbase;

public class c55_webtables extends testbase {
//<table>, bir web tablosunu tanımlamak için kullanılan HTML etiketidir.
//Tablonun başlığını tanımlamak için <th> kullanılırken ,
// web tablosu için sırasıyla satırları ve sütunları tanımlamak için <tr> ve <td> etiketleri kullanılır.
//table//tbody//tr  tbody içindeki tüm satırları döndürür.
//table//tbody//tr[1]  tbody'deki ilk satırı döndürür.
//table//tbody//tr[1]//td  İlk satırdaki tüm tablo hücrelerini döndürür.
//table//tbody//tr[1]//td[4]  tbody'deki ilk satırdaki 4. hücreyi döndürür.
//table//tbody//tr[4]//td[5]  4. satır 5. sütun
//table//tbody//tr[10]//td[2]  Satır 10 data 2
//table//tbody//tr//td[5]  5. sütundaki tüm satırları döndürür.

//Go to URL: http://demo.guru99.com/test/web-table-element.php
//To find third row of table
//To get 3rd row's 2nd column data
//Get all the values of a Dynamic Table

@Test
    public void test1(){
    driver.get("http://demo.guru99.com/test/web-table-element.php");
    WebElement webtable=driver.findElement(By.xpath("//table[@class='dataTable']"));

    System.out.println(webtable.findElement(By.xpath(".//tr[3]")).getText());

    System.out.println(webtable.findElement(By.xpath(".//tr[3]//td[2]")).getText());

    int satırsayısı=webtable.findElements(By.xpath(".//tr")).size();
    int sutunsayısı=webtable.findElements(By.xpath(".//tr[1]//td")).size();

    for (int i = 1; i <satırsayısı ; i++) {
        for (int j = 1; j <=sutunsayısı ; j++) {
            String cellvalue=webtable.findElement(By.xpath(".//tr[" + i + "]//td["+ j + "]")).getText();
            System.out.print(cellvalue + " ");

        }
        System.out.println();
        System.out.println("------------------------------------------------");

    }

}

}
