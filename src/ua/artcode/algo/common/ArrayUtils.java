package ua.artcode.algo.common;

/**
 * Created by serhii on 06.12.15.
 */
public class ArrayUtils {

    public static void swap(int[] mas, int a, int b){
        int temp = mas[a];
        mas[a] = mas[b];
        mas[b] = temp;
    }

    public static int[] genMas(int size, int leftR, int rightR){
        int[] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = generateRandomNum(leftR, rightR);
        }

        return mas;
    }

    private static int generateRandomNum(int leftR, int rightR) {
        return leftR + (int)(Math.random() * (rightR - leftR));
    }
}
