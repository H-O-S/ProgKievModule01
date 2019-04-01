/**
 * Java Start. Lesson 08.
 *
 * @author Oleg Khrulov
 * @version dated 21.03.2019
 */

/*
        Проверить баланс круглых скобок в выражении. Пример: “((x – 8)+a(y – 1))”.
*/

package Lesson08;

public class MainL08Task02 {
    static final String MESSAGE = "%sкрывающихся скобок больше на %d";
    static final String ZERO = "Количество скобок одинаковое ";
    static final String POSITIVE_PREFIX = "От";
    static final String NEGATIVE_PREFIX = "За";


    public static void main(String[] args) {
        String toCheck = " j,E(TFK))ASJ((DY))FGA,RJ,F";
        int balance = getBalance(toCheck);
        String messange = getMessage(balance);
        System.out.println(messange);
    }

    static int getBalance(String toCheck){
        int result = 0;
        for (int position = 0; position < toCheck.length(); position++){
            char letter = toCheck.charAt(position);

/*
            Switch
*/
/*
            if (letter == '('){
                result++;
            }else if (letter == ')'){
                result--;
            }
*/
        }
        return result;
    }

    static String getMessage(int balance){

        if (balance > 0){
            return String.format(MESSAGE, POSITIVE_PREFIX, balance);
        }else if (balance < 0){
            return String.format(MESSAGE, NEGATIVE_PREFIX, -balance);
        }else {
            return ZERO;
        }
    }
}
