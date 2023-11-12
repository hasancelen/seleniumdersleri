package day_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class c17_chromeoptions {
    static WebDriver driver;

    @BeforeClass
    public  static void setup(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("");
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }

}
