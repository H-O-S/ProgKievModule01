/**
 * Java Start. Home Work 04.
 *
 * @author Oleg Khrulov
 * @version dated 14.03.2019
 */

/*
        С помощью консоли пользователь вводит
        математическое выражение типа “1+33-4*7”. Написать
        программу для подсчета его значения. Приоритет
        операций не учитывается.
*/

package HW04;

import java.util.Scanner;

public class MainHW04Task08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int arrayLength = scanner.nextInt();

        System.out.format("Hello!");

        scanner.close();
    }
}
