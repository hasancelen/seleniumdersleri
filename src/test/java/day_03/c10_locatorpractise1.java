package day_03;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c10_locatorpractise1 {

    /*
    Create the driver with BeforeClass and make it static inside the class.
    Go to http://www.google.com
    Type "Green Mile" in the search box and print the number of results.
    Type "Premonition" in the search box and print the number of results.
    Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
    Close with AfterClass.
     */
    static WebDriver driver;

    @Before
    public void google2(){
    }
    @BeforeClass
    public static void google1(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.google.com");
    }

    @AfterClass
    public static void print(){

    }

    @Test
    public void google() throws InterruptedException {
        WebElement googlesearchbox= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        googlesearchbox.sendKeys("Green Mile"+ Keys.ENTER);
        Thread.sleep(2000);
        googlesearchbox.click();
        Thread.sleep(2000);

    }


}
