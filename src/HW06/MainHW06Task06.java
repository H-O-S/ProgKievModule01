/**
 * Java Start. Home Work 06.
 *
 * @author Oleg Khrulov
 * @version dated 12.04.2019
 */

/*
        Ввести с консоли целое число. Посчитать количество
        единиц в его бинарном представлении (“1011” –> 3).
*/

package HW06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainHW06Task06 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer:");

            int integer = scanner.nextInt();
            int enteredInteger = integer;
            int count = 0;

            while (integer != 0) {
                if (integer % 2 > 0) {
                    count++;
                }

                integer = integer / 2;
            }

            System.out.printf("The number of units in the binary representation %nof the entered integer %d is %s%n",
                    enteredInteger, count);

            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("Input Error!");
        }
    }
}
