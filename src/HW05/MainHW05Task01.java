/**
 * Java Start. Home Work 05.
 *
 * @author Oleg Khrulov
 * @version dated 09.04.2019
 */

/*
        Написать функцию, которая принимает массив чисел в качестве
        аргумента, увеличивает его первые 3 элемента на 1 и
        возвращает их сумму как результат. После изменения массив и
        сумму надо вывести на экран.
*/

package HW05;

import java.util.Arrays;

public class MainHW05Task01 {
    private static Integer[] array = {1, 2, 3, 4, 5, 6};
    private static final String RESULT_SUM = "The sum of the first three elements of the modified array is equal to: %n%d%n%n";
    private static final String RESULT_ARRAY = "Array after processing: %n%s%n";

    public static void main(String[] args) {
        System.out.printf(RESULT_SUM + RESULT_ARRAY,
                arrayProcessing(array),
                Arrays.toString(array));
    }

    public static Integer arrayProcessing(Integer[] array){
        int sum = 0;
        for (int i = 0; i < 3; i++){
            sum += ++array[i];
        }

        return sum;
    }
}