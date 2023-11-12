package day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchExample {
    public static void main(String[] args) {
        // WebDriver'ı başlat

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Google'a gidin
        driver.navigate().to("https://www.google.com");

        // Arama kutusunu bulun ve "Hasan Çelen"i arayın
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Hasan Çelen");
        searchBox.sendKeys(Keys.RETURN);

        // İlk sonuç sayısını bulun
        WebElement resultStats = driver.findElement(By.id("result-stats"));
        String resultStatsText = resultStats.getText();
        //geri google anasayfaya dön forword back ile
        driver.navigate().back();

        //sahibinden sitesine git
        driver.navigate().to("https://www.arabam.com");

        // sahibinden arama kutusuna volvo s90 yaz ve arat
       WebElement searchBox1 = driver.findElement(By.xpath("//input[@placeholder='Kelime, galeri adı veya ilan no ile ara']"));
        searchBox1.sendKeys("volvo s90");
        searchBox1.sendKeys(Keys.RETURN);

        // Sonuçları yazdırın
        System.out.println("Arama sonuçları: " + resultStatsText);

        // Tarayıcıyı kapat
        driver.quit();
    }
}