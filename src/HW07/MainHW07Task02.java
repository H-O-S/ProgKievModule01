/**
 * Java Start. Home Work 07.
 *
 * @author Oleg Khrulov
 * @version dated 12.04.2019
 */

/*
        Дано текст и определенное слово. Посчитать сколько раз
        заданное слово встречается в тексте.
*/

package HW07;

public class MainHW07Task02 {
    public static void main(String[] args) {
        String word = "hello";
        String text = "hello, it's me. hello from the outside. hello, how are you?";
        int pos = 0;
        int count = 0;

        do {
            pos = text.indexOf(word, pos);

            if (pos >= 0){
                count++;
                pos += word.length();
            }
        }while (pos >= 0);

        System.out.printf("The specified word is found %d times in this text.", count);
    }
}