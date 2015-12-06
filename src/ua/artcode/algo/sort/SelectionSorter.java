package ua.artcode.algo.sort;

import ua.artcode.algo.common.ArrayUtils;

/**
 * Created by serhii on 06.12.15.
 */
public class SelectionSorter {

    // 4,2,1,7,3,-5
    //
    public static void sort(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            int minI = i;
            for (int j = i; j < mas.length; j++) {
                if(mas[j] < mas[minI]){
                    minI = j;
                }
            }
            ArrayUtils.swap(mas,i,minI);
        }
    }




}
