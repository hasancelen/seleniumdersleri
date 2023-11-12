package day_03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.testbase;

public class c40_hoverover extends testbase {

    @Test
    public void test1(){
        //Go to URL: https://www.amazon.com/
        //Click on “Hello, Sign in Account & Lists” link.
        //Click on Orders page.
        //Verify the page title contains “Amazon”.
        driver.get("https://www.amazon.com");
        Actions actions=new Actions(driver);
        WebElement hellolink=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        WebElement order=driver.findElement(By.xpath("//span[normalize-space()='Orders']"));

        actions.moveToElement(hellolink).click(order).perform();

        Assert.assertTrue(driver.getTitle().toLowerCase().contains("amazon"));



    }
}
