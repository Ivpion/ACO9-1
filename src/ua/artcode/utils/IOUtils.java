package ua.artcode.utils;

import java.io.*;
import java.util.Scanner;

/**
 * Created by serhii on 13.12.15.
 */
public class IOUtils {


    public static String cat(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));// txt, json, xml, html
        String res = "";

        while(sc.hasNextLine()){
            res += sc.nextLine() + "\n";
        }

        return res;
    }

    public static void redirect(String src, String path) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(path);
        pw.println(src);
        //pw.flush();
        pw.close();
    }

    public static void appendContent(String src, String path) throws FileNotFoundException {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(path,true));
            pw.println(src);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(pw != null){
                pw.close();
            }
        }
        //pw.flush();
    }

    public static void appendContentReleaseResource(String src, String path) throws FileNotFoundException {
        // try with resources, auto closing stream
        try(PrintWriter pw = new PrintWriter(new FileWriter(path,true));) {
            pw.println(src);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //pw.flush();
    }

}
