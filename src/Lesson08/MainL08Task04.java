/**
 * Java Start. Lesson 08.
 *
 * @author Oleg Khrulov
 * @version dated 21.03.2019
 */

/*
        Вывести на экран все буквы английского алфавита.
*/

package Lesson08;

public class MainL08Task04 {
    public static void main(String[] args) {
        int digit = 8664534;
        int result = 0;
        while (digit != 0) {
            result = result + digit % 10;
            digit = digit / 10;
        }
        int check1 = 4 + 3 + 5 + 4 + 6 + 6 + 8;
        int check2 = 8 + 6 + 6 + 4 + 5 + 3 + 4;

        System.out.println(result);
        System.out.println(check1);
        System.out.println(check2);

    }
}
