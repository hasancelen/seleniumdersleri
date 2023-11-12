package day_03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.interactions.Actions;
import utilities.testbase;

public class c39_dragandbyvertical extends testbase {
    @Test
    public void  test1() throws InterruptedException {
        // Go to URL: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
        // Shift 34 units to the up and 34 units to the down on the vertical axis.
        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
        WebElement slider=driver.findElement(By.xpath("//span[@tabindex='0']"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(slider,0,-39).perform();
        Thread.sleep(3000);
        WebElement output=driver.findElement(By.cssSelector("span#sliderOutput2"));
        System.out.println("output.getText() = " + output.getText());

        actions.dragAndDropBy(slider,0,39).perform();
        Thread.sleep(3000);
        WebElement output1=driver.findElement(By.cssSelector("span#sliderOutput2"));
        System.out.println("output1.getText() = " + output1.getText());

    }
}
