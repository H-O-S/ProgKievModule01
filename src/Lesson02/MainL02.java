/**
 * Java Start. Lesson 02.
 *
 * @author Oleg Khrulov
 * @version dated 28.02.2019
 */
package Lesson02;

import java.util.Scanner;

public class MainL02 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter string: ");
            String s = scanner.nextLine();
            System.out.println("You printed: " + s);
            System.out.print("Enter integer: ");
            int i = scanner.nextInt();
            System.out.println("You printed: " + i);
    }
}
