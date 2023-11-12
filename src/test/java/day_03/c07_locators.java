package day_03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c07_locators {
      /*seleniumda 8 adet locator (webelement konumlandirici) var
-ID
    * ID locator aslinda bir webElementin id attribute udur..
    * id="value" seklindeyse biz elementi value ile buluruz
-NAME
    * NAME locator aslinda bir webElementin name attribute udur..
    * name="value" seklindeyse biz elementi value ile buluruz
-CLASS
    * CLASS locator aslinda bir webElementin class attribute udur..
    * class="value" seklindeyse biz elementi value ile buluruz
-TAGNAME
    * html elementlerinin taglari ile locate etme stratejisidir
    * <tagName></tagName>  ise biz bu elementi tagName degeri ile locate ederiz
-LINK TEST
    *linkText locator sadece <a> elementlerde bulunur
-PARTIALLINK TEST
    *linkText ile ayni olmakla beraber, textin bir bolumunu almak yeterlidir..
-CSS
-XPATH
*/
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com/");
    }

    @Test
    public void locatorId(){
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
    }

    @Test
    public void locatorname(){
        WebElement fieldkeywords = driver.findElement(By.name("field-keywords"));
        fieldkeywords.click();
    }
    @Test
    public void locatorclass(){
        WebElement locaterclass = driver.findElement(By.className("nav-input nav-progressive-attribute"));
        locaterclass.click();
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }
}
