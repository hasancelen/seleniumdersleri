package day_03;

import net.bytebuddy.asm.Advice;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c26_alert1 {

    /*
    Alerts : Web sitelerinde iki tur alert vardir.
    1.HTML alerts : sag click yapip incelenebilir, dolayisla diger web elementler gibidir
    2.JS alerts: bunlar sag click yapilip incelenemez, dolayisiyla da diger WebElementler’den farklidir.
     Interview sorusu
        - Alertleri nasıl kullanırsın (handle edersin)
          driver.switchTo().alert()   bununla kullanılır.
          komutları:
          accept -> OK, TAMAM yani olumlu butona basmak
          dismiss -> CANCEL, HAYIR yani olumsuz butona basmak
          getText -> Alertin mesaj alınır.
          SendKeys -> Alertin inputuna mesaj göndermek için kullanılır.
 */
    /*
    Go to URL: http://demo.guru99.com/test/delete_customer.php
    Delete customer ID: 123
    Remove 2 alerts that appear.

     */

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }//Close driver.
    @Test
    public void alert1(){
        WebElement customer=driver.findElement(By.name("cusid"));
        customer.sendKeys("123"+ Keys.ENTER);

        System.out.println(" alert text = " + driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

    }



}
