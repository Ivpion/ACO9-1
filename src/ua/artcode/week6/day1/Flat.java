package ua.artcode.week6.day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by serhii on 12.12.15.
 */
public class Flat {

    private static final int PRICE = 10_000;
    private static double squareAmount = 100;

    private double roomHeight;
    private List<Room> rooms = new ArrayList<>();
    private List<Window> windows = new ArrayList<>();

    public Flat(double roomHeight) {
        this.roomHeight = roomHeight;
    }

    public void buildRoom(int width, int length){
        rooms.add(new Room(width,length));
    }

    public boolean buildWindow(double width, double height){
        try {
            Window window = new Window(width, height);
            windows.add(window);
        } catch (WindowIsTooHigh windowIsTooHigh) {
            return false;
        }
        return true;
    }


    // inner
    public class Window {

        double width;
        double height;

        public Window(double width, double height) throws WindowIsTooHigh {
            this.width = width;
            if(canSetUpWindow(height)){
                this.height = height;
            } else {
                throw new WindowIsTooHigh("Easy man!");
            }
        }

        private boolean canSetUpWindow(double height){
            return roomHeight >= height;
        }
    }

    // nested
    public static class Room {
        int width;
        int length;

        public Room(int width, int length) {
            this.width = width;
            this.length = length;
        }

        public double square(){
            return width * length;
        }
    }

    public class WindowIsTooHigh extends Exception {
        public WindowIsTooHigh(String s) {
            super(s);
        }
    }

}

class TestInit {

    public static void test(){

        // local class
        class VarClass {
            int a;
            int b;
        }

        VarClass varClass = new VarClass();
        varClass.a = 23;
        varClass.b = 23;


        // Anonymous
        Comparator cl = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                return -1;
            }
        };


        Flat flat = new Flat(2.30);
        flat.buildRoom(10,10);
        flat.buildRoom(20, 10);
        flat.buildRoom(30,30);

        boolean result = flat.buildWindow(1.5, 2);

        // not practical example
        Flat.Room flatRoom = new Flat.Room(12,23);
        try {
            Flat.Window flatWindow = flat.new Window(12,23);
        } catch (Flat.WindowIsTooHigh windowIsTooHigh) {
            windowIsTooHigh.printStackTrace();
        }


    }

}
