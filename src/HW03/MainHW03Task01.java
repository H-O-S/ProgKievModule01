/**
 * Java Start. Home Work 03.
 *
 * @author Oleg Khrulov
 * @version dated 12.03.2019
 */

/*
        1. Задать массив целых чисел длинной 10 эл.
        2. Отсортировать числа в массиве
        3. Вывести на экран результат.
        4. Сделать возможность наполнения массива с клавиатуры*.
*/

package HW03;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class MainHW03Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            System.out.print("Enter an integer to fill cell the array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        scanner.close();
    }
}
