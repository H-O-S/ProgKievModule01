/**
 * Java Start. Home Work 03.
 *
 * @author Oleg Khrulov
 * @version dated 12.03.2019
 */
package HW03;

import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class MainHW03Task04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int arraySum = 0;

        for (int i = 0; i < array.length; i++){
            System.out.print("Enter an integer to fill cell the array[" + i + "]: ");
            array[i] = scanner.nextInt();
            arraySum += array[i];
        }

        System.out.println(arraySum / array.length);

        scanner.close();
    }
}
