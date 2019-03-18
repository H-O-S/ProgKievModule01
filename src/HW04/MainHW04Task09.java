/**
 * Java Start. Home Work 04.
 *
 * @author Oleg Khrulov
 * @version dated 14.03.2019
 */

/*
        Написать метод для зеркального переворота
         элементов в массиве ([1, 2, 3, 4] -> [4, 3, 2, 1]).
*/

package HW04;

import java.util.Arrays;

@SuppressWarnings("Duplicates")
public class MainHW04Task09 {

    private static int[] mirrorFlipValues(int[] array){
        int[] resultArray = new int[array.length];

        for (int i =0; i < array.length; i++){
            resultArray[(array.length-1) - i] = array[i];
        }
        return resultArray;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(mirrorFlipValues(array)));
    }
}
