/**
 * Java Start. Home Work 04.
 *
 * @author Oleg Khrulov
 * @version dated 14.03.2019
 */

/*
        Найти в массиве число, которое повторяется
        наибольшее количество раз. Не использовать
        коллекции.
*/

package HW04;

public class MainHW04Task07 {
    public static void main(String[] args) {

        int[] array = {11,28,13,11,13,16,11,28,19,28,15,28};
        int count1;
        int count2 = 0;
        int repeatingNumber = 0;

        for (int i1 : array) {
            count1 = 0;

            for (int i : array) {
                if (i1 == i) {
                    count1++;
                }
            }

            if (count1 > count2) {
                count2 = count1;
                repeatingNumber = i1;
            }
        }

        System.out.printf("The number that is repeated %d times, " +
                "\nwhich is the greatest number of repetitions: \n%d",
                count2, repeatingNumber);
    }
}
