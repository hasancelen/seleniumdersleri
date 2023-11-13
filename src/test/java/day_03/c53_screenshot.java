package day_03;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utilities.testbase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class c53_screenshot extends testbase {
    // Go to amazon.com.
    // Take Page ScreenShot.
    // Spesific WebElement ScreenShot

    @Test
    public void takeFullPageScreenShot() throws IOException {
        driver.get("https://www.amazon.com.tr/");

        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        String date=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
        File destination=new File(".\\test-output\\Screenshots\\AmazonLogo"+date+".png");
        FileUtils.copyFile(source,destination);

    }

    // Spesific WebElement ScreenShot
    @Test
    public void takeSpesificWEScreenShot() throws IOException, InterruptedException {
        driver.get("https://www.amazon.com.tr/");
        WebElement amazonlogo=driver.findElement(By.id("nav-logo-sprites"));
        File source=amazonlogo.getScreenshotAs(OutputType.FILE);
        String date=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
        File destination=new File(".\\test-output\\Screenshots\\AmazonLogo"+date+".png");

        FileUtils.copyFile(source,destination);

    }

}
