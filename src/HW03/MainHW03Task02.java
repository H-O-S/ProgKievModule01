/**
 * Java Start. Home Work 03.
 *
 * @author Oleg Khrulov
 * @version dated 12.03.2019
 */
package HW03;

import java.util.Arrays;

public class MainHW03Task02 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int temp = array[0];

        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.println(Arrays.toString(array));
    }
}
