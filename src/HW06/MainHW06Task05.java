/**
 * Java Start. Home Work 06.
 *
 * @author Oleg Khrulov
 * @version dated 12.04.2019
 */

/*
        Ввести с консоли число в бинарном формате. Перевести
        его в int и вывести на экран (“10” -> 2).
*/

package HW06;

import java.util.Scanner;

public class MainHW06Task05 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input binary number:");

            System.out.printf("The binary number entered above is equal %nto the next integer in decimal:%n%d%n",
                    Integer.parseInt(scanner.nextLine(), 2));

            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Input Error!");
        }
    }
}