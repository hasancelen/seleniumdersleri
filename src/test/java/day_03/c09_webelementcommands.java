package day_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c09_webelementcommands {
    //    sendKeys(String keys) methodu elementimize gonderilen degerleri klavyeyle yazarmis gibi gonderir
    //    isDisplayed() bize boolean ifadeler dondurur!!!!!!!!!! Elementin sayfada goruntulenip goruntulenmedigi bilgisini verir
    //    isSelected() methodumuz bize elementin secili olup olmadigi bilgisini verir. (checkbox, radio)
    //    isEnabled() bir elementin aktif mi degil mi oldugunun bilgisini verir (button ve girdi yapilan elementlerde kullanilabilir)
    //    submit() methodu formlari submit etmemize yani gondermemize yardimci olur. ENTER tusunun gorevini gorur.
    //    click() methodu bir elemente sol tiklamamizi saglar.
    //    getLocation() methodu bize elementin konumunu verir
    //    clear() methodu input alanlarindaki yazilarin temizlenmesini saglar.
    //    getText() methodu elementin contentini bize verir
    //    getAttribute(String key) methodu bize elementin istedigimiz attribute degerini getirir.
    //    getSize() elementin boyutunu bize verir.


    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com.tr/");
    }
    @Test
    public void webelementcommands() throws InterruptedException {

        WebElement searchbox = driver.findElement(By.xpath("//input[@name='field-keywords']"));
        System.out.println(driver.getTitle());
        searchbox.sendKeys("iphone15");
        searchbox.click();
        searchbox.clear();
        searchbox.sendKeys("galaxy A73");
        searchbox.submit();
        Thread.sleep(5000);
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }

}

