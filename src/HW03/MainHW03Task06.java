/**
 * Java Start. Home Work 03.
 *
 * @author Oleg Khrulov
 * @version dated 12.03.2019
 */
package HW03;

import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class MainHW03Task06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        boolean continueEntering = true;

        for (int i = 0; i < array.length; i++){
            System.out.print("Enter an integer to fill cell the array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        while (continueEntering){
            System.out.println("________________________________________________________________________________");
            System.out.print("\nEnter the index of the array element to display " +
                    "(values from '0' to '" + (array.length - 1) +
                    "' or '-1' to exit the program): ");

            int arrayElementIndex = scanner.nextInt();

            if (arrayElementIndex == -1) {
                continueEntering = false;
            } else {
                System.out.println(array[arrayElementIndex]);
            }
        }

        System.out.println("\n======================================================================================");
        System.out.println("\nTHE END!");

        scanner.close();
    }
}
