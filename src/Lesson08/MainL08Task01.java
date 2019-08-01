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

public class MainL08Task01 {
    public static void main(String[] args) {

        for (char letter = 'a'; letter <= 'z'; letter++){
            System.out.print(Character.toUpperCase(letter));
            System.out.print(letter);
            System.out.print(letter);

        }
    }
}
