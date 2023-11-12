package day_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c03_beforeclass_afterclass {
    static WebDriver driver;
    @BeforeClass
    public static void beforeClass() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("before class çalıştı");
    }

    @AfterClass
    public static void afterClass() {
        driver.close();
        System.out.println("after class çalıştı");
    }
    @Test
    public void test1(){
        driver.get("https://www.google.com");
        System.out.println("test1 çalıştı");
    }

    @Test
    public void test2(){

        driver.get("https://www.amozon.com");
        System.out.println("test2 çalıştı");
    }





}
