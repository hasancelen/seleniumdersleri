package day_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManager {
    public static void main(String[] args) {
      /*  Java Tabanlı Projeye bağımlılığı yönetmenin bir yoludur.
                Projenin kalbidir..
• Maven, büyük projeler üzerinde çalışırken POM (Project Object Model) ile proje oluştururken kullanılabilir.
• Birden çok IDE (IntelliJ, Eclipse, vs.) ile çalışır.
• Maven bir Java derleme ve yönetim aracıdır.
• Maven ile tüm otomasyon süreci sürecini yönetmek için maven projesi oluşturabilirsiniz.
• Maven, pom.xml dosyası ile dependency’leri yönetmemize yardımcı oluyor.
• Maven, Java uygulamalarını derlememize, çalıştırmamıza ve dağıtmamıza yardımcı oluyor.
• Ant ve Gradle gibi başka araçlar da var ancak Maven en popüler olanıdır.
                */
    /*
    • Set Path.
    • Create chrome driver.
    • Maximize the window.
    • Open google home page https://www.google.com/
    • Verify that you are Google in the title.
*/
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        String googletitle=driver.getTitle();

        System.out.println("googletitle = " + googletitle);

        System.out.println(driver.getTitle().equals("Google")?"title is Google":"title is not Goggle");

        driver.close();


    }
}
