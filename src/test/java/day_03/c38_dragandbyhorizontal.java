package day_03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.testbase;

public class c38_dragandbyhorizontal extends testbase {

    @Test
    public void test01(){
        //Go to URL: https://rangeslider.js.org/
        //Shift 100 units to the right and 100 units to the left on the horizontal axis.
        driver.get("https://rangeslider.js.org/");
        Actions actions=new Actions(driver);
        WebElement slider=driver.findElement(By.xpath("//div[@id='js-rangeslider-0']//div[@class='rangeslider__handle']"));
        actions.dragAndDropBy(slider,100,0).perform();
        WebElement output=driver.findElement(By.id("js-output"));
        System.out.println("output.getText() = " + output.getText());

        actions.dragAndDropBy(slider,-100,0).perform();
        WebElement output1=driver.findElement(By.id("js-output"));
        System.out.println("output1.getText() = " + output1.getText());

    }

}
