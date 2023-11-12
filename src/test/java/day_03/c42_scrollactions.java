package day_03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.testbase;

public class c42_scrollactions extends testbase {
    @Test
    public void scrollpagedown() throws InterruptedException {
        Actions actions=new Actions(driver);
        driver.get("https://www.amazon.com.tr/");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(1000);
    }
    @Test
    public void scrollarrowdown() throws InterruptedException {
        Actions actions=new Actions(driver);
        driver.get("https://www.amazon.com.tr/");

            // Çerezleri kabul et düğmesini bul ve tıkla
            WebElement acceptCookiesButton = driver.findElement(By.id("sp-cc-accept")); // Bu örnekte, kabul düğmesini bir ID ile bulduk
            acceptCookiesButton.click();

        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(1000);

    }
}
