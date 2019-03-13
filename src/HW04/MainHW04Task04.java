/**
 * Java Start. Home Work 04.
 *
 * @author Oleg Khrulov
 * @version dated 13.03.2019
 */

/*
        Дано массив из 10 целых чисел. Вывести на экран
        сумму всех его элементов кроме первого и
        последнего.
*/

package HW04;

public class MainHW04Task04 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sumArray = 0;

        for (int i = 1; i < (array.length - 1); i++){
            sumArray += array[i];
        }

        System.out.println(sumArray);
    }
}
