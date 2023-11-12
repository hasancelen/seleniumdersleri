package day_03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.testbase;

public class c35_windowhandle03 extends testbase {

    @Test
    public void test1() throws InterruptedException {
        // 1- browser ac
        String mainwindows=driver.getWindowHandle();
        // 2- acilan sekmede https://www.amazon.com/ ac
        driver.get("https://www.amazon.com.tr /");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        // 3- yeni sekme olustur
        driver.switchTo().newWindow(WindowType.TAB);
        String tab1=driver.getWindowHandle();

        // 4- acilan sekmede https://www.linkedin.com/ ac
        driver.get("https://www.linkedin.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        // 5- yeni pencere olustur
        driver.switchTo().newWindow(WindowType.WINDOW);
        String newwindow=driver.getWindowHandle();

        // 6- acilan pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        // 7- amazon sekmesine gecerek arama kismina 'Amazon sekmesini buldun' yaz
        driver.switchTo().window(mainwindows);
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Amazon sitesi bulundu ..... ");


    }

}
