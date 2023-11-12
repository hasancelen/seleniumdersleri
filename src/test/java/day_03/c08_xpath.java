package day_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c08_xpath {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com/");
    }
    @Test
    public void xpath() throws InterruptedException {
        WebElement searchbox = driver.findElement(By.xpath("//input[@name='field-keywords']"));
        searchbox.sendKeys("iphone15"+ Keys.ENTER);
        Thread.sleep(5000);
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }





}
