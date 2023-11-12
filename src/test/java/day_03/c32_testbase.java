package day_03;

import org.junit.Test;
import utilities.testbase;

public class c32_testbase extends testbase {

    @Test
    public void test1(){
        driver.get("https://go.microsoft.com/fwlink/?linkid=2140622&channel=stable&version=119.0.2151.44");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    @Test
    public void test2(){
        driver.get("https://chat.openai.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }


}
