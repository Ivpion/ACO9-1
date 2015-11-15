package ua.artcode.service_centre.v1;

/**
 * Created by serhii on 15.11.15.
 */
public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", year=" + year +
                ", month=" + month +
                '}';
    }
}
