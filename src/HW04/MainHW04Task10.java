/**
 * Java Start. Home Work 04.
 *
 * @author Oleg Khrulov
 * @version dated 18.03.2019
 */

/*
        Написать метод, который заполнит массив
        произвольного размера числами по возрастанию,
        начиная с центра массива, например,
        [5,4,3,2,1,0,1,2,3,4,5].
        [5,4,3,2,1,0,1,2,3,4].
*/

package HW04;

import java.util.Arrays;
import java.util.Scanner;

public class MainHW04Task10 {

    private static int[] fillArray(int[] array){

        int middleOfArray = array.length/2;
        boolean evenArrayLength = (array.length % 2) == 0;

        for (int i = 0; i <= middleOfArray; i++){
            array[middleOfArray - i] = i;
            if ( !(evenArrayLength && (i == middleOfArray))){
                array[middleOfArray + i] = i;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int[] array = new int[scanner.nextInt()];

        System.out.println(Arrays.toString(fillArray(array)));

        scanner.close();
    }
}
