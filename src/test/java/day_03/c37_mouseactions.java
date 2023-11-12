package day_03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.testbase;

public class c37_mouseactions extends testbase {
    // Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.

    @Test
    public void test01(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement oslo=driver.findElement(By.xpath("(//div[@id='box1'])"));
        WebElement Washington=driver.findElement(By.xpath("(//div[@id='box3'])"));
        WebElement Madrid=driver.findElement(By.xpath("(//div[@id='box7'])"));
        WebElement Rome=driver.findElement(By.xpath("(//div[@id='box6'])"));
        WebElement Seoul=driver.findElement(By.xpath("(//div[@id='box5'])"));
        WebElement Copenhagen=driver.findElement(By.xpath("(//div[@id='box4'])"));
        WebElement Stockholm=driver.findElement(By.xpath("(//div[@id='box2'])"));

        WebElement norway=driver.findElement(By.xpath("(//div[@id='box101'])"));
        WebElement sweden=driver.findElement(By.xpath("(//div[@id='box102'])"));
        WebElement us=driver.findElement(By.xpath("(//div[@id='box103'])"));
        WebElement denmark=driver.findElement(By.xpath("(//div[@id='box104'])"));
        WebElement korea=driver.findElement(By.xpath("(//div[@id='box105'])"));
        WebElement italy=driver.findElement(By.xpath("(//div[@id='box106'])"));
        WebElement spain=driver.findElement(By.xpath("(//div[@id='box107'])"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(oslo,norway)
                .dragAndDrop(Stockholm,sweden)
                .dragAndDrop(Washington,us)
                .dragAndDrop(Copenhagen,denmark)
                .dragAndDrop(Seoul,korea)
                .dragAndDrop(Rome,italy)
                .dragAndDrop(Madrid,spain)
                .build().perform();



    }
}
