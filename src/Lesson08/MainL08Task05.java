/**
 * Java Start. Lesson 08.
 *
 * @author Oleg Khrulov
 * @version dated 21.03.2019
 */

/*
        Вычислить x^n.
*/

package Lesson08;

import java.util.Scanner;

public class MainL08Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;

        System.out.println("Введите целое число 1: ");
        int x = scanner.nextInt();

        System.out.println("Введите целое число 2: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            result = result * x;
        }
        System.out.println(result);

        scanner.close();
    }
}
