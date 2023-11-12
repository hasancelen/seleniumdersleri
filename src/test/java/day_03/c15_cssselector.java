package day_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c15_cssselector {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://the-internet.herokuapp.com");

    }

    @AfterClass
    public static void teardown(){
        driver.close();
    }


}
