/**
 * Java Start. Home Work 03.
 *
 * @author Oleg Khrulov
 * @version dated 12.03.2019
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
