/**
 * Java Start. Home Work 07.
 *
 * @author Oleg Khrulov
 * @version dated 12.04.2019
 */

/*
        Дано текст из 3-х слов “word1 word2 word3”. Поменять 1-е
        и 3-е слова местами и вывести на экран результат.
*/

package HW07;

public class MainHW07Task01 {
    public static void main(String[] args) {
        String input = "word1 word2 word3";
        String[] words = input.split(" ");
        String result = words[2] + " " + words[1] + " " + words[0];

        System.out.println(result);
    }
}