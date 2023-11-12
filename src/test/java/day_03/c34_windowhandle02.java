package day_03;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.testbase;

public class c34_windowhandle02 extends testbase {

    @Test
    public void test1() throws InterruptedException {
  // 1- browser ac
        String windowhandle=driver.getWindowHandle();
        // 2- yeni sekme olustur
        driver.switchTo().newWindow(WindowType.TAB);
        String windowhandletab=driver.getWindowHandle();

        // 3- yeni pencere olustur
        driver.switchTo().newWindow(WindowType.WINDOW);
        String windowhandlewin=driver.getWindowHandle();
        // 4- 2. sekmede https://www.linkedin.com/ ac
       driver.switchTo().window(windowhandletab);
       driver.get("https://www.linkedin.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());

        // 5- son pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac
        driver.switchTo().window(windowhandlewin);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("driver.getTitle() = " + driver.getTitle());



        // 6- Ilk sekmede https://www.amazon.com/ ac
        driver.switchTo().window(windowhandle);
        driver.get("https://www.amazon.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());




    }

}
