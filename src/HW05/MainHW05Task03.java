/**
 * Java Start. Home Work 05.
 *
 * @author Oleg Khrulov
 * @version dated 10.04.2019
 */

/*
        Написать ф-ю для объединения 2-х массивов в один. Вывести
        результат на консоль.
*/

package HW05;

import java.util.Arrays;

public class MainHW05Task03 {
    public static void main(String[] args) {
        char[] arrayOne = {'H', 'E', 'L', 'L', 'O'};
        char[] arrayTwo = {'W','O', 'R', 'L', 'D'};

        char[] arrayResult = mergeArrays (arrayOne, arrayTwo);

        System.out.println(Arrays.toString(arrayResult));
    }

    static char[] mergeArrays(char[] arrayOne, char[] arrayTwo){
        char[] arrayResult = new char[arrayOne.length + arrayTwo.length];

        System.arraycopy(arrayOne, 0, arrayResult, 0, arrayOne.length);
        System.arraycopy(arrayTwo, 0, arrayResult, arrayOne.length, arrayTwo.length);

        return arrayResult;
    }
}