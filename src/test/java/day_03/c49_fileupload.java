package day_03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.testbase;

public class c49_fileupload extends testbase {
@Test
    public void test1(){
    driver.get("https://the-internet.herokuapp.com/upload");
    WebElement dosyasec=driver.findElement(By.xpath("//input[@id='file-upload']"));


    String path= System.getProperty("user.dir")+System.getProperty("file.separator")+"fileexist";
    dosyasec.sendKeys(path);

    driver.findElement(By.id("file-submit")).click();

    WebElement succesmessage=driver.findElement(By.tagName("h3"));
    Assert.assertTrue(succesmessage.isDisplayed());


}

}
