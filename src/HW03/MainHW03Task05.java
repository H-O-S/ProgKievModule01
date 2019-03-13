/**
 * Java Start. Home Work 03.
 *
 * @author Oleg Khrulov
 * @version dated 13.03.2019
 */

/*
        Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).
*/

package HW03;

import java.util.Arrays;

public class MainHW03Task05 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        int[] resultArray = new int[array.length];

        for (int i =0; i < array.length; i++){
            resultArray[(array.length-1) - i] = array[i];
        }

        System.out.println(Arrays.toString(resultArray));
    }
}
