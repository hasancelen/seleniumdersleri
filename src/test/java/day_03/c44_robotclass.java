package day_03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.testbase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class c44_robotclass extends testbase {

    @Test
    public void test1() throws AWTException, InterruptedException {
        driver.get("http://www.amazon.com.tr/");
        WebElement searhbox=driver.findElement(By.id("twotabsearchtextbox"));
        searhbox.sendKeys("robot ");

        Robot robot=new Robot();
        WebElement çerezkabul= driver.findElement(By.xpath("//input[@tabindex='1']"));
        çerezkabul.click();
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       Thread. sleep(3000);
       robot.mouseWheel(10);
    }
}
