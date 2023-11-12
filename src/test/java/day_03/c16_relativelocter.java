package day_03;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.sql.Driver;
import java.time.Duration;

public class c16_relativelocter {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.bestbuy.com");

    }
    @AfterClass
    public static void terdown(){
        driver.close();
    }
    @Test()
    public void hellotest(){
        WebElement helloheader=driver.findElement(RelativeLocator.with(By.tagName("div")).below(By.xpath("(//img[@class='logo'])[1]")));
        Assert.assertTrue(helloheader.isDisplayed());


    }
}
