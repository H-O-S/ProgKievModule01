/**
 * Java Start. Home Work 07.
 *
 * @author Oleg Khrulov
 * @version dated 12.04.2019
 */

/*
        Дано текст. Убрать лишние пробелы, расставить знаки
        препинания. Пример: «Я длинное предложение Я
        второе предложение.» -> «Я длинное предложение. Я
        второе предложение.»
*/

package HW07;

public class MainHW07Task04 {
    public static void main(String[] args) {
        final String text = "I     am a long      sentence I am the     second sentence. Yes!";

        StringBuilder stringBuilder = new StringBuilder();
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++){
            if (words[i].length() > 0){
                stringBuilder.append(words[i]);

                if ((i + 1 < words.length) &&
                        (words[i + 1].length() > 0) &&
                        Character.isUpperCase(words[i + 1].charAt(0)) &&
                        ( !words[i].endsWith("."))){
                    stringBuilder.append(". ");
                }
                else
                    stringBuilder.append(" ");
            }
        }

        System.out.println(stringBuilder.toString());
    }
}