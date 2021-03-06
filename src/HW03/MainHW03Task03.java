/**
 * Java Start. Home Work 03.
 *
 * @author Oleg Khrulov
 * @version dated 12.03.2019
 */

/*
        1. Ввести с клавиатуры массив из 10 чисел.
        2. Разбить его на 2 массива равной длинны.
        3. Отсортировать каждую из половинок и вывести их содержимое на экран.
*/

package HW03;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class MainHW03Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] initialArray = new int[10];

        for (int i = 0; i < initialArray.length; i++){
            System.out.print("Enter an integer to fill cell the array[" + i + "]: ");
            initialArray[i] = scanner.nextInt();
        }

        int[] newArray1 = Arrays.copyOf(initialArray,initialArray.length/2);
        int[] newArray2 = Arrays.copyOfRange(initialArray, initialArray.length/2, initialArray.length);

        Arrays.sort(newArray1);
        Arrays.sort(newArray2);

        System.out.println(Arrays.toString(newArray1));
        System.out.println(Arrays.toString(newArray2));

        scanner.close();
    }
}
