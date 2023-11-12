package day_03;

import org.junit.*;

public class c04_jnitannotations {
   /* * *****ANNOTATIONS******
    There are 6 annotations using common
- @Test : Bağımsız olarak çalışabilecek bir test oluşturmamızı sağlar. Return type -> void
- @Before : Test başlamadan önce yapılması gereken hazırlıkları yaptığımız method için kullanılır. Her method'dan önce çalışır.
            - @BeforeClass : @Before gibidir ancak ondan farklı olarak sadece class' ın başında 1 kez çalışır.Static olmak zorundadır.
            - @After : Her testten sonra çalışır, test yapıldıktan sonra kapatma gibi fonksiyonları yerine getirir.
- @AfterClass : Her class' ın sonunda 1 kez çalışır, static olmak zorundadır.
            - @Ignore : Yazıldığı method' un çalıştırılmamasını sağlar. Test calistirildiginda bu method' un Ignore olduğu raporda görünür.
*/

    @Before
    public void before(){
        System.out.println("Before metodu çalıştı");
    }

    @Test
    public void test1(){
        System.out.println("test1 çalıştı");
    }

    @Test
    public void test2(){
        System.out.println("test2 çalıştı");
    }

    @Test @Ignore
    public void test3(){
        System.out.println("test3 çalıştı");
    }

    @After
    public void after(){
        System.out.println("After metodu çalıştı");

    }

}

