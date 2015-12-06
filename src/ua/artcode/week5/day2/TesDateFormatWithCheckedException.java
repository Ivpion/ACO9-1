package ua.artcode.week5.day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 */
public class TesDateFormatWithCheckedException {


    public static void main(String[] args) {



        try {
            System.out.println("start try");

            Date parsed = parseDate(new Scanner(System.in).nextLine());
            long time = parsed.getTime();

            System.out.println("Stadart date out " + parsed);

            System.out.println("SimpleDateFormatter out " + new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss").format(parsed));

            System.out.printf("formatter date %1$ty-%1$tM-%1$td %1$tH-%1$tm\n", parsed);

            System.out.println("end try");
        } catch (Exception ex) {
            ex.printStackTrace();
            // block for process exception situation
            System.out.println("in catch block");
        }

        System.out.println("after try-catch");


        Date date = new Date();
        Date date1 = new Date(System.currentTimeMillis());


    }

    public static Date parseDate(String source) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(source);
    }
}
