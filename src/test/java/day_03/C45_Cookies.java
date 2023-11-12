package day_03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.testbase;

import java.util.Set;

public class C45_Cookies extends testbase {
    //***Cookie cookie  = driver.manage().cookie-methods

    //Go to URL: https://kitchen.applitools.com/ingredients/cookie



    //Print all the cookies.
    //Add Cookie.
    //Edit Cookie.
    //Delete Cookie.
    //Delete All Cookies.
    @Test
    public void test1() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");

        //Print all the cookies.
        Set<org.openqa.selenium.Cookie> allcookies=driver.manage().getCookies();
        for (org.openqa.selenium.Cookie c:allcookies) {
            System.out.println(c);
        }
        //Get Cookie.
        System.out.println("***************");
        System.out.println("driver.manage().getCookieNamed(\"protein\") = " + driver.manage().getCookieNamed("protein"));
        Assert.assertEquals("chicken",driver.manage().getCookieNamed("protein").getValue());

        System.out.println("****************");

        //Find the total number of cookies.

        System.out.println("allcookies.size() = " + allcookies.size());
        System.out.println("****************");
        //Add Cookie.

        org.openqa.selenium.Cookie cookie=new Cookie("kalsiyum","süt");
        driver.manage().addCookie(cookie);
        System.out.println("***************");
        System.out.println("driver.manage().getCookieNamed(\"protein\") = " + driver.manage().getCookieNamed("protein"));
        Assert.assertEquals("chicken",driver.manage().getCookieNamed("protein").getValue());


    }
}