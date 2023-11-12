package day_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c27_alert2 {


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

    //Click for JS Alert butonuna tikla
//I am a JS Alert alertini kabul et
//JS Confirm butonuna tikla
//I am a JS Confirm alertini iptal et
//JS Prompt butonuna tikla
//I am a JS prompt alertine text yolla ve kabul et
    @Test
    public void alert1() {


    }
}
