/**
 * Java Start. Home Work 02.
 *
 * @author Oleg Khrulov
 * @version dated 11.03.2019
 */
package HW02;

import java.util.Scanner;

public class MainHW02Task02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();

        System.out.println("x1 + x2 = " + (x1 + x2));
        System.out.println("x1 - x2 = " + (x1 - x2));
        System.out.println("x1 * x2 = " + (x1 * x2));
        System.out.println("x1 / x2 = " + (x1 / x2));
        System.out.println("x1 % x2 = " + (x1 % x2));
        System.out.println("x1++ + x2 = " + (x1++ + x2));
        System.out.println("++x1 + x2 = " + (++x1 + x2));
        System.out.println("x1 + --x2 = " + (x1 + --x2));
        System.out.println("x1 + x2-- = " + (x1 + x2--));
        System.out.println("x1 += 2 + x2 = " + (x1 += 2 + x2));
    }
}
