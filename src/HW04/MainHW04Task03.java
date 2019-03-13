/**
 * Java Start. Home Work 04.
 *
 * @author Oleg Khrulov
 * @version dated 13.03.2019
 */

/*
        Заполнить массив числами от 100 до 0.
*/

package HW04;

import java.util.Arrays;

public class MainHW04Task03 {
    public static void main(String[] args) {

        int[] array = new int[101];

        for (int i = 0; i < array.length; i++){
            array[i] = 100 - i;
        }

        System.out.println(Arrays.toString(array));
    }
}
