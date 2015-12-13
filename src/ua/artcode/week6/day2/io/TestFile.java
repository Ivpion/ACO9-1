package ua.artcode.week6.day2.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by serhii on 13.12.15.
 */
public class TestFile {


    public static final String HOME_DIR_PATH =
            "/home/serhii/dev/IdeaProjects/ACO9/home";

    public static void main(String[] args) {

        File dir = new File(HOME_DIR_PATH);

        File file = new File(HOME_DIR_PATH + "/week1.txt");

        System.out.printf("file.exists() %s\n", file.exists());
        System.out.printf("file.isFile() %s\n", file.isFile());
        System.out.printf("file.isDirectory() %s\n", file.isDirectory());


        File currentDirectory = new File(".");
        System.out.println(currentDirectory.getAbsolutePath());

        System.out.println(new File("/").getAbsolutePath());


        // ls
        File temp = new File("temp.txt");
        if(!temp.exists()){
            try {
                boolean created = temp.createNewFile(); // touch
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        File parent = temp.getAbsoluteFile().getParentFile();// cd ..

        System.out.println(temp.getName());

        boolean deleteResult = temp.delete();

        System.out.println("parent " + file.getPath());
        System.out.println("parentPath " + parent.getName());


        // ls
        String[] childrenPath = parent.list();
        System.out.println("***************************");
        for (String child : childrenPath) {
            System.out.println(child);
        }
        System.out.println("***************************");


        System.out.println("\n\n\n");



        File[] fileChildren = parent.listFiles();
        for (File fileChild : fileChildren) {
            System.out.println(fileChild.getAbsolutePath());
        }

        System.out.println("\n\n");


        //file.renameTo()


    }
}
