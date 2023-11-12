package day_03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c28_basicautication {


    /* BasicAuthentication : Normal olarak web sitelerinde login fonksiyonu icin kullanici adi ve sifre
    webelementlerine bilgileri girip, login buttonuna basariz.
    Ancak bazi websitelerinde ve ozellikle API haberlesmesinde kullanici adi ve sifreyi manuel olarak tek
    tek girmek yerine, servis saglayicinin bize vereccegi bilgiler dogrultusunda, kulllanici adi ve sifreyi
    URL’e ekleyebiliriz.
    Boylece sayfaya gitme ve login fonksiyonu tek adimda halledilmis olur.
    Auth güvenlik nedeniyle kullanılır
    Yetkilendirmenin bir yolu, aşağıdaki sözdizimini kullanmaktır:
    https://kullanıcı adı:şifre@URL    */
    /*
    Go to URL: https://the-internet.herokuapp.com/basic_auth
    Username: admin
    Password: admin
    Syntax:  driver.get("https://USERNAME:PASSWORD@URL");
    Authenticate using the above method and test data.
    https://admin:admin@the-internet.herokuapp.com/basic_auth
    Verify the congratulations message.

    */
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/iframe");
    }


}




