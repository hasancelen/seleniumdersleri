package day_03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.testbase;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class c48_filedownload extends testbase {

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");

        WebElement selenium=driver.findElement(By.linkText("selenium-snapshot.png"));
        selenium.click();

        Thread.sleep(3000);

        String path=System.getProperty("user.home")+System.getProperty("file.separator")+"Downloads"+
                System.getProperty("file.separator")+"selenium-snapshot.png";
        Assert.assertTrue(Files.exists(Paths.get(path)));

    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");

        List<WebElement> downloadlist=driver.findElements(By.tagName("a"));
        for (int i=1;i<downloadlist.size()-1;i++){
            downloadlist.get(i).click();
            Thread.sleep(5000);
            Assert.assertTrue(Files.exists(Paths.get(System.getProperty("user.home")+System.getProperty("file.separator")+"Downloads"+
                    System.getProperty("file.separator")+downloadlist.get(i).getText())));
        }

    }
}
