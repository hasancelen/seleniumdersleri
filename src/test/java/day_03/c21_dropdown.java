package day_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class c21_dropdown {
      static WebDriver driver;
      @BeforeClass
    public static void setup(){
          driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          driver.get("");
      }
      @Test
    public void test1(){
          WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
          Select select=new Select(dropdown);
          List<WebElement> optionslist= select.getOptions();
          System.out.println("optionslist = " + optionslist);
          for (WebElement each:optionslist){
              System.out.println("each.getText() = " + each.getText());
          }
      }
}
