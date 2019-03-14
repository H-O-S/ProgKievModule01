/**
 * Java Start. Home Work 04.
 *
 * @author Oleg Khrulov
 * @version dated 13.03.2019
 */

/*
        Вывести на экран числа от 10 до 20 с помощью
        всех известных циклов.
*/

package HW04;

public class MainHW04Task01 {
    public static void main(String[] args) {

        int[] array = new int[11];
        int arrayElement = 0;

        System.out.println("Display using  cycle for():");
        for (int i = 0; i < array.length; i++){
            array[i] = 10 + i;
            System.out.println(array[i]);
        }

        System.out.println("\nDisplay using  cycle for-each:");
        for (int x : array) {
            System.out.println(x);
        }

        System.out.println("\nDisplay using  cycle while():");
        while (arrayElement < array.length){
            System.out.println(array[arrayElement]);
            arrayElement++;
        }

        System.out.println("\nDisplay using  cycle do-while:");
        arrayElement = 0;
        do {
            System.out.println(array[arrayElement]);
            arrayElement++;
        } while (arrayElement < array.length);

        System.out.println("\nTHE END!");
    }
}
