package ua.artcode.week6.day2.io;

import ua.artcode.utils.IOUtils;

import java.io.FileNotFoundException;

/**
 * Created by serhii on 13.12.15.
 */
public class TestIOUtils {


    public static void main(String[] args) throws FileNotFoundException {
        String content = IOUtils.cat(TestFile.HOME_DIR_PATH + "/week1.txt");
        System.out.println(content);

        IOUtils.redirect("tartatartar", "temp.txt");


    }
}
