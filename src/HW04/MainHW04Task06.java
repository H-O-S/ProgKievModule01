/**
 * Java Start. Home Work 04.
 *
 * @author Oleg Khrulov
 * @version dated 13.03.2019
 */

/*
        Найти в массиве чисел элементы с наибольшим и
        наименьшим значениями.
*/


package HW04;

public class MainHW04Task06 {
    public static void main(String[] args) {

        int[] array = {11,28,-13,24,-5,16,37,-81,19,10};
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int arrayElement : array) {
            if (maxValue < arrayElement) {
                maxValue = arrayElement;
            }
            if (minValue > arrayElement) {
                minValue = arrayElement;
            }
        }

        System.out.printf("maxValue = %d \nminValue = %d", maxValue, minValue);
    }
}
