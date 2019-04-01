/**
 * Java Start. Lesson 08.
 *
 * @author Oleg Khrulov
 * @version dated 21.03.2019
 *//*


*/
/*
        Дан словарь в виде «англ. слово=русское слово, англ.
        слово=русское слово,…». Написать программу переводчик
        на основе словаря.
*//*


package Lesson08;

public class MainL08Task03 {
    public static void main(String[] args) {
        String words = "Hello=привет;Word=Мир";
        String eng = "Hello, world!";
        String[][] dictionary = prepareDiction(words);
        String translated = translate(eng, dictionary);
        System.out.println(translated);
    }

    static String[][] prepareDiction(String src){
        String[][] result;
        String[] pairs = src.split(";");
        result = new String[pairs.length][];

        for (int pairIndex = 0; pairIndex < pairs.length; pairIndex++){
            result[pairIndex] = pairs[pairIndex].split("=");
        }
        return result;
    }

    static String translate(String input, String[][] dct){
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word: words){
            result.append(translateWord(word, dct)).append(" ");
        }
        return result.toString();
    }

    static String translateWord(String word, String[][] dct){
        boolean capitalized = Character.isUpperCase(word.charAt(0));
        char lastSymbol = word.charAt(word.length() - 1);
        boolean endsWithAlpha = Character.isAlphabetic(lastSymbol);
        StringBuilder result = new StringBuilder();
        if (!endsWithAlpha){
            word = word.substring(0, word.length() - 1);
        }
        for (String[] pair: dct){
            if (pair[0].equalsIgnoreCase(word)) {
                result.append(pair[1]);
                break;
            }
        }
        if (!capitalized){
            result.setCharAt(0, Character.toLowerCase(result.charAt(0)));
        }else {
            result.setCharAt(0, Character.toUpperCase(result.charAt(0)));

        }
        if (!endsWithAlpha){
            result.append(lastSymbol);
        }
        return result.toString();
    }
}
*/
