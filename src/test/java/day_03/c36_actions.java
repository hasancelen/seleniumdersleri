package day_03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.testbase;

import javax.swing.*;

public class c36_actions extends testbase {
    /*
Mouse Actions
click(): Geçerli konumu tıklamak için kullanılır.
doubleClick(): Fare konumuna çift tıklama gerçekleştirmek için kullanılır.
clickAndHold(): Fare tıklamasını serbest bırakmadan gerçekleştirmek için kullanılır.
contextClick(): Geçerli fare konumuna sağ fare tıklaması gerçekleştirmek için kullanılır.
moveToElement (WebElement target): Fare işaretçisini hedef konumun merkezine taşımak için kullanılır.
dragAndDrop(WebElement source, WebElement target): Öğeyi kaynaktan sürüklemek ve hedef konuma bırakmak için kullanılır.
dragAndDropBy(source, xOffset, yOffset): Bu yöntem, kaynak öğeyi tıklar ve tutar ve belirli bir ofset kadar hareket eder, ardından fareyi serbest bırakır. Ofsetler x & y ile tanımlanır.(X = Yatay Kaydır, Y= Dikey Kaydır)
release(): Geçerli konumdaki sol fare düğmesini serbest bırakmak için kullanılır.
perform(): Bir eylemi yürütür. Bu, bir eylemi gerçekleştirmek için sonunda kullanılmalıdır.
perform() KULLANMAYI UNUTMAYIN!
*/
    @Test
    public void test1() throws InterruptedException {
        //Go to URL: https://demoqa.com/buttons
        driver.get("https://demoqa.com/buttons");
        WebElement doubleclickbtn=driver.findElement(By.id("doubleClickBtn"));
        WebElement rightclickbtn=driver.findElement(By.id("rightClickBtn"));
        WebElement clickbme=driver.findElement(By.xpath("(//*[.='Click Me'])[2]"));

       Actions actions=new Actions(driver);
       actions.doubleClick(doubleclickbtn).perform();
       Thread.sleep(2000);
       actions.contextClick(rightclickbtn).perform();
        Thread.sleep(2000);
       actions.click(clickbme).perform();
        Thread.sleep(2000);

       /* actions.doubleClick(doubleclickbtn)
                .contextClick(rightclickbtn)
                .click(clickbme)
                .build()
                .perform();*/

        Assert.assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("rightClickMessage")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("dynamicClickMessage")).isDisplayed());




    }

    //Go to URL: https://demoqa.com/buttons

    //Run the buttons on the page using the Actions Class.
    //Verify the texts that appear after the buttons are operated.

}
