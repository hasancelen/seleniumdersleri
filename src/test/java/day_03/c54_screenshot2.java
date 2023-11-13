package day_03;

import org.apache.commons.io.FileUtils;
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

public class c54_screenshot2 extends testbase {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
//Saving the image to  the path.
//Getting screenshot of Orange HRM Logo.
//Getting screenshot of  Orange HRM Page Section.
    @Test
    public void test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement logo= driver.findElement(By.xpath("//img[@alt='company-branding']"));
        File source=logo.getScreenshotAs(OutputType.FILE);
        String date=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
        File destination=new File(".\\test-output\\Screenshots\\orangehrmLogo"+date+".png");
        FileUtils.copyFile(source,destination);

        TakesScreenshot ts=(TakesScreenshot) driver;
        File source2=ts.getScreenshotAs(OutputType.FILE);
        File destination2=new File(".\\test-output\\Screenshots\\orangehrmfull"+date+".png");
        FileUtils.copyFile(source2,destination2);
    }

}
