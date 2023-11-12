package day_03;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class c47_fileexist {
    @Test
    public void test(){
        System.out.println(System.getProperty("user.dir"));

        String path1=System.getProperty("user.dir")+"\\fileexist";

        String path2=System.getProperty("user.dir")+System.getProperty("file.separator")+"fileexist";


        System.out.println("path1 = " + path1);
        System.out.println("path2 = " + path2);

        Assert.assertTrue(Files.exists(Paths.get(path1)));
        Assert.assertTrue(Files.exists(Paths.get(path2)));
    }
}
