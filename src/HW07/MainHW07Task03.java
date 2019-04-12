/**
 * Java Start. Home Work 07.
 *
 * @author Oleg Khrulov
 * @version dated 12.04.2019
 */

/*
        Дано 3 массива чисел. С помощью 1-2-х циклов найти
        сумму элементов во всех массивах.
*/

package HW07;

public class MainHW07Task03 {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 4, 5, 6};
        int[] arrayTwo = {3, 4, 5, 6};
        int[] arrayThree = {1, 2, 4, 5, 6};

        int[][] arrayAll = {arrayOne, arrayTwo, arrayThree};
        int sum = 0;

        for (int i = 0; i < arrayAll.length; i++){
            for (int j = 0; j < arrayAll[i].length; j++){
                sum += arrayAll[i][j];
            }
        }
        System.out.printf("Sum of elements in all arrays: %d", sum);
    }
}